package com.game_store;

import com.game_store.menu.*;
import com.game_store.models.*;
import com.game_store.services.*;
import com.game_store.users.Customer;

import java.util.*;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Game_Database database = new Game_Database();
		ArrayList<Game> game_list = database.get_game_list();
        Customer customer = new Customer();

        while (true) {

            Main_Menu.display_menu();

            System.out.print("\nEnter a choice: ");
            int choice, exit_choice;
            choice = scanner.nextInt();

            if (choice < 1 || choice > 4) {

                while (true) {

                    Screen_Methods.invalid_message();
                    System.out.print("Enter a choice: ");
                    choice = scanner.nextInt();

                    if (choice >= 1 && choice <= 4) {

                        System.out.println();
                        break;

                    }
                }
            }

            if (choice == 1)
            {
                System.out.println();
                Display_Items.display_items(game_list);
                exit_choice = Exit.go_back_or_exit();

                if (exit_choice == 2)
                {
                    System.out.println();
                    Exit.exit_message();
                    break;
                }
            }
            else if (choice == 2)
            {
                System.out.println();
                Order.make_order(game_list, customer);

                exit_choice = Exit.go_back_or_exit();

                if (exit_choice == 2)
                {
                    System.out.println();
                    Exit.exit_message();
                    break;
                }
            }
            else if (choice == 3)
            {
                System.out.println();
                Admin_Access.admin_menu(game_list);
                exit_choice = Exit.go_back_or_exit();

                if (exit_choice == 2)
                {
                    System.out.println();
                    Exit.exit_message();
                    break;
                }
            }
            else
            {
                System.out.println();
                Exit.exit_message();
                break;
            }

        }

		scanner.close();
	}
}
