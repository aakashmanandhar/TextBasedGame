/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.game;

import com.aakash.game.command.GameCommand;
import com.aakash.game.command.GameCommandFactory;
import com.aakash.game.entity.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author aakashm
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            Player player = new Player();
            System.out.println("Enter the name of Player");
            player.setName(input.readLine());
            System.out.println("Welcome " + player.getName() + " to the world of adventure");
            String line = "";
            while (true) {
                System.out.println("You are at New Baneshwor");
                //System.out.println("Allowed to go Right Left Up Down");
                System.out.print(player.getName() + " >");
                line = input.readLine();
                String[] tokens = line.split(" ");
                GameCommand cmd = GameCommandFactory.get(tokens[0].toLowerCase());
                if (cmd != null) {
                    cmd.setPlayer(player);
                    cmd.setInput(input);
                    cmd.execute(tokens);
                } else {
                    System.out.println("Invalid Command");
                }
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

}
