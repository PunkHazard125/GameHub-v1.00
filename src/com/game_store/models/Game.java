package com.game_store.models;

public class Game {
   
   String name;
   double price;

   public Game() { }

   public Game(String new_name, double new_price)
   {
      this.name = new_name;
      this.price = new_price;
   }

   public void set_name(String new_name) {
      this.name = new_name;
   }

   public void set_price(double new_price) {
      this.price = new_price;
   }

   public String get_name() {
      return this.name;
   }

   public double get_price() {
      return this.price;
   }
}
