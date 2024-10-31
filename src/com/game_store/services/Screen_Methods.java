package com.game_store.services;

public class Screen_Methods {

    public static void clear_screen() {

        System.out.print("\033[2J\033[H");
    
    }

    public static void blue_text() {
    
        System.out.print("\033[1;34m");
    
    }
    
    public static void green_text() {
    
        System.out.print("\033[1;32m");
    
    }
    
    public static void red_text() {
    
        System.out.print("\033[1;31m");
    
    }
    
    public static void reset_text() {
    
        System.out.print("\033[0m");
    
    }

    public static void invalid_message() {

        Screen_Methods.red_text();
        System.out.print("\nInvalid Choice! Try Again.\n\n");
        Screen_Methods.reset_text();

    }
}
