package com.game_store.menu;

import com.game_store.services.*;
import java.util.*;

public class Exit {

    private static Scanner scanner = new Scanner(System.in);

    public static void exit_message() {

        Screen_Methods.clear_screen();
        Screen_Methods.red_text();
        System.out.println("Exited!");
        Screen_Methods.reset_text();

    }

    public static int go_back_or_exit() {

        int choice;

        while (true) {

            System.out.print("1. Go Back to Main Menu\n2. Exit\n\nEnter a Choice: ");
            choice = scanner.nextInt();


            if (choice < 1 || choice > 2)
            {
                Screen_Methods.invalid_message();
                continue;
            }

            return choice;

        }
    }
}
