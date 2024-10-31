package com.game_store.users;

public class Customer {

    public String name;
    public String phone_number;
    public String gmail;
    public String password;
    public int game_pal;
    public double balance;

    public void set_name(String new_name) {

        this.name = new_name;

    }

    public void set_phone(String new_number) {

        this.phone_number = new_number;

    }

    public void set_gmail(String new_mail) {

        this.gmail = new_mail;

    }

    public void set_password(String new_pass) {

        this.password = new_pass;

    }

    public void set_game_pal(int new_pal) {

        this.game_pal = new_pal;

    }

    public void set_balance(double new_balance) {

        this.balance = new_balance;

    }
}
