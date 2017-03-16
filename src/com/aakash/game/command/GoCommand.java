/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.game.command;

import java.io.IOException;

/**
 *
 * @author aakashm
 */
public class GoCommand extends GameCommand {

    String[] directions = {"right", "left", "up", "down"};

    @Override
    public void execute(String[] tokens) throws IOException {
        if (!hasDirection(tokens[1])) {
            System.out.println("Not a Direction");
        } else {
            System.out.println("You are at " + tokens[1]);
            switch (tokens[1].toLowerCase()) {
                case "right":
                    break;
                case "left":
                    break;
                case "up":
                    break;
                case "down":
                    break;
            }
        }
    }

    private boolean hasDirection(String key) {
        for (int i = 0; i < directions.length; i++) {
            if (directions[i].equalsIgnoreCase(key)) {
                return true;

            }
        }
        return false;

    }

}
