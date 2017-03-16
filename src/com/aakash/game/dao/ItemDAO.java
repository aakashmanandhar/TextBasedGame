/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.game.dao;

import com.aakash.game.entity.Item;
import java.util.List;

/**
 *
 * @author aakashm
 */
public interface ItemDAO {

    boolean insert(Item item);

    boolean delete(Item item);

    Item getByName(String name);

    List<Item> getAll();

}
