package com.game_store.menu;

import com.game_store.models.Game;
import com.game_store.services.Real_Time;
import com.game_store.services.Screen_Methods;
import com.game_store.users.Customer;
import java.util.*;

public class Order {

    static Scanner scanner = new Scanner(System.in);

    public static int get_game_info(ArrayList<Game> game_list) {

        int serial;

        while (true) {

            System.out.print("Enter Serial Number of the Game: ");
            serial = scanner.nextInt();

            if (serial < 1 || serial > game_list.size())
            {
                Screen_Methods.invalid_message();
                continue;
            }

            break;
        }

        System.out.println();
        Screen_Methods.blue_text();
        System.out.print("Game Info: ");
        Screen_Methods.reset_text();
        System.out.println();
        System.out.println("Game Name : " + game_list.get(serial - 1).get_name());
        System.out.println("Game Price: " + String.format("%.2f", game_list.get(serial - 1).get_price()));
        System.out.println();

        return serial - 1;
    }

    public static void get_customer_info(Customer customer) {

        scanner.nextLine();
        System.out.print("Enter Name: ");
        customer.set_name(scanner.nextLine());
        System.out.print("Enter Phone Number: ");
        customer.set_phone(scanner.nextLine());
        System.out.print("Enter Gmail: ");
        customer.set_gmail(scanner.nextLine());
        System.out.print("Enter GamePal Account Number (Six Digits): ");
        customer.set_game_pal(scanner.nextInt());

    }

    public static void buy_game(ArrayList<Game> game_list, Customer customer, double price, int serial) {

        double total = price + (price * 0.10);
        System.out.println("Amount to be Paid Including 10% VAT: " + "$" + String.format("%.2f", total));

        System.out.print("Enter GamePal Balance: $");
        customer.set_balance(scanner.nextDouble());

        if (customer.balance < total)
        {
            System.out.println();
            Screen_Methods.red_text();
            System.out.println("Insufficient Funds! Try Again Later.");
            Screen_Methods.reset_text();
            System.out.println();
        }
        else
        {
            Random random = new Random();
            int otp = random.nextInt(90001) + 510000;
            int input_otp;

            System.out.print("Your OTP Code is: ");
            Screen_Methods.blue_text();
            System.out.print(otp);
            Screen_Methods.reset_text();
            System.out.println();
            System.out.println();

            while (true) {

                System.out.print("Enter Your OTP Code: ");
                input_otp = scanner.nextInt();

                if (input_otp != otp)
                {
                    Screen_Methods.red_text();
                    System.out.print("\nInvalid OTP! Try Again.\n");
                    Screen_Methods.reset_text();
                    System.out.println();
                    continue;
                }

                break;
            }

            Screen_Methods.green_text();
            System.out.println("\nOrder Confirmed!");
            System.out.println("Transaction Successful!");
            Screen_Methods.reset_text();

            String current_time = Real_Time.getRealTime();

            System.out.println();
            Screen_Methods.blue_text();
            System.out.print("Game: ");
            Screen_Methods.reset_text();
            System.out.println(game_list.get(serial).get_name());
            Screen_Methods.blue_text();
            System.out.print("Customer: ");
            Screen_Methods.reset_text();
            System.out.println(customer.name);
            Screen_Methods.blue_text();
            System.out.print("Customer Phone: ");
            Screen_Methods.reset_text();
            System.out.println(customer.phone_number);
            Screen_Methods.blue_text();
            System.out.print("Customer Email: ");
            Screen_Methods.reset_text();
            System.out.println(customer.gmail);
            Screen_Methods.blue_text();
            System.out.print("Customer GamePal Account Number: ");
            Screen_Methods.reset_text();
            System.out.println(customer.game_pal);
            Screen_Methods.blue_text();
            System.out.print("Paid Amount Including 10% VAT: ");
            Screen_Methods.reset_text();
            System.out.printf("$%.2f\n", total);
            Screen_Methods.blue_text();
            System.out.print("Time of Purchase: ");
            Screen_Methods.reset_text();
            System.out.println(current_time);
            System.out.println();
        }

    }

    public static void make_order(ArrayList<Game> game_list, Customer customer) {

        Screen_Methods.blue_text();
        System.out.print("Welcome to the Store!\n");
        Screen_Methods.reset_text();
        System.out.println();

        int serial;

        serial = get_game_info(game_list);

        double price = game_list.get(serial).get_price();

        int choice;

        while (true) {

            System.out.print("1. Buy the Game\n2. Cancel\n\nEnter a Choice: ");
            choice = scanner.nextInt();

            if (choice < 1 || choice > 2)
            {
                Screen_Methods.invalid_message();
                continue;
            }

            break;
        }

        if (choice == 1)
        {
            System.out.println();
            get_customer_info(customer);
            System.out.println();
            buy_game(game_list, customer, price, serial);
            return;
        }

        System.out.println();
        Screen_Methods.red_text();
        System.out.println("Cancelled!");
        Screen_Methods.reset_text();
        System.out.println();
    }
}
