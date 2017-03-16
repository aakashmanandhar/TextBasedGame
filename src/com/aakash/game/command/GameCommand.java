/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.game.command;

import com.aakash.game.entity.Player;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author aakashm
 */
public abstract class GameCommand {
    protected Player player;
    protected BufferedReader input;

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setInput(BufferedReader input) {
        this.input = input;
    }
    
    
    
    
    public abstract void execute(String[] tokens) throws IOException;
        
    
}
