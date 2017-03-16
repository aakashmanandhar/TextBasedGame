/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.game.command;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author aakashm
 */
public class GameCommandFactory {
    
    private static Map<String, GameCommand> commands=initCommands();
    
    private static Map<String, GameCommand> initCommands(){
        Map<String, GameCommand> cmd=new HashMap<>();
        cmd.put("exit", new ExitCommand());
        cmd.put("go", new GoCommand());
        return cmd;
    }
    
    public static GameCommand get(String key){
       return (commands.containsKey(key))?commands.get(key):null;
        }
    
}
