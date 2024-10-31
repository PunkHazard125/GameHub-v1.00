package com.game_store.users;

public class Admin {

    private final String name;
    private String password;

    public Admin(){

        this.name = "GameHub";
        this.password = "123456";
    }

    public String get_name() {

        return this.name;

    }

    public String get_password() {

        return this.password;

    }

    public void change_pass(String new_pass) {

        this.password = new_pass;

    }
}
