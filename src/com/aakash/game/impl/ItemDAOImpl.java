/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.game.impl;

import com.aakash.game.dao.ItemDAO;
import com.aakash.game.entity.Item;
import java.util.List;

/**
 *
 * @author aakashm
 */
public class ItemDAOImpl implements ItemDAO{
    
    private List<Item> items;

    public ItemDAOImpl(List<Item> items) {
        this.items = items;
    }
    
    
    
    @Override
    public boolean insert(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item getByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Item> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
