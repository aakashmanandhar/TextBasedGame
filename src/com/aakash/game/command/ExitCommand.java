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
public class ExitCommand extends GameCommand {

    @Override
    public void execute(String[] tokens) throws IOException {
        System.out.println("Do You Really want to Exit? [Y/N]");
        if(input.readLine().equalsIgnoreCase("y")){
            System.exit(0);
        }
    }
    
}
