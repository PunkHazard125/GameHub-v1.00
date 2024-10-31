package com.game_store.menu;

import com.game_store.models.*;
import com.game_store.services.*;
import com.game_store.users.*;
import java.util.*;

public class Admin_Access {

    public static Scanner scanner = new Scanner(System.in);
    public static Admin admin = new Admin();

    public static void welcome_message() {

        Screen_Methods.blue_text();
        System.out.print("Welcome to Admin Access!\n");
        Screen_Methods.reset_text();

    }

    public static void admin_login() {

        while (true) {

            System.out.print("\nEnter Admin Username: ");
            String input_name = scanner.next();
            System.out.print("Enter Password: ");
            String input_password = scanner.next();

            if (input_name.equals(admin.get_name()) && input_password.equals(admin.get_password()))
            {
                break;
            }
            else
            {
                System.out.println();
                Screen_Methods.red_text();
                System.out.print("Invalid Username or Password!\nPlease Try Again!\n");
                Screen_Methods.reset_text();
            }
        }
    }

    public static void add_game(ArrayList<Game> game_list) {

        Game new_game = new Game();

        scanner.nextLine();
        System.out.print("\nEnter Game Name: ");
        new_game.set_name(scanner.nextLine());
        System.out.print("\nEnter Game Price: ");
        new_game.set_price(scanner.nextDouble());

        game_list.add(new_game);

    }

    public static void remove_game(ArrayList<Game> game_list) {

        int serial;

        System.out.println();

        while (true) {

            System.out.print("Enter Game Number: ");
            serial = scanner.nextInt();
            serial--;

            if (serial < 0 || serial > game_list.size() - 1)
            {
                Screen_Methods.invalid_message();
            }
            else
            {
                game_list.remove(serial);
                return;
            }
        }
    }

    public static void store_control(ArrayList<Game> game_list) {

        Screen_Methods.blue_text();
        System.out.print("\nWelcome, Admin!\n\n");
        Screen_Methods.reset_text();
        System.out.print("1. Add a New Game\n2. Remove a Game\n\nEnter an Option: ");

        int admin_choice;

        while (true) {

            admin_choice = scanner.nextInt();

            if (admin_choice < 1 || admin_choice > 2)
            {
                Screen_Methods.invalid_message();
            }
            else
            {
                break;
            }
        }

        if (admin_choice == 1)
        {
            add_game(game_list);
        }
        else
        {
            remove_game(game_list);
        }
    }

    public static void admin_menu(ArrayList<Game> game_list) {

        welcome_message();
        admin_login();
        store_control(game_list);

    }
}
