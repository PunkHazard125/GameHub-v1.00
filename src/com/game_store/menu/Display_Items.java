package com.game_store.menu;

import com.game_store.models.Game;
import com.game_store.services.Screen_Methods;

import java.util.ArrayList;

public class Display_Items {

    public static void display_items(ArrayList<Game> game_list) {

        Screen_Methods.blue_text();
        System.out.printf("%-8s  %-35s%-10s\n", "Serial", "Game Name", "Price");
        Screen_Methods.reset_text();

        for (int index = 0; index < game_list.size(); index++) {

            System.out.printf("%-8d  %-35s$%-10.2f\n", index + 1, game_list.get(index).get_name(), game_list.get(index).get_price());

        }
    }
}
