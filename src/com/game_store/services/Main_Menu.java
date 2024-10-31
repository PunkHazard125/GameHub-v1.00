package com.game_store.services;

public class Main_Menu {

    public static void display_menu() {

        Screen_Methods.clear_screen();
        Screen_Methods.blue_text();
        System.out.print("\n-------------------\nWelcome to GameHub\n-------------------\n");
        Screen_Methods.reset_text();
        System.out.print("\n1. Display Available Games\n");
        System.out.print("2. Place an Order\n");
        System.out.print("3. Admin Access\n");
        System.out.print("4. Exit\n");

    }
}
