package com.game_store.services;

import com.game_store.models.Game;

import java.util.ArrayList;

public class Display_Item {

    public static void display_info(ArrayList<Game> game_list, int index) {

        System.out.printf("Game Name: %s\n", game_list.get(index).get_name());
        System.out.printf("Price: $%.2f\n", game_list.get(index).get_price());

    }
}
