package com.game_store.services;

import java.util.ArrayList;
import com.game_store.models.Game;

public class Game_Database {

    private ArrayList<Game> game_list = new ArrayList<>();

    public  Game_Database() {

        game_list.add(new Game("Assassin's Creed IV: Black Flag", 29.99));
        game_list.add(new Game("Baldur's Gate 3", 49.99));
        game_list.add(new Game("Call of Duty: Black Ops 2", 39.99));
        game_list.add(new Game("Cyberpunk 2077", 59.99));
        game_list.add(new Game("DOOM Eternal", 44.99));
        game_list.add(new Game("EA Sports FC 24", 34.99));
        game_list.add(new Game("Elden Ring", 54.99));
        game_list.add(new Game("Far Cry 6", 49.99));
        game_list.add(new Game("Forza Horizon 5", 59.99));
        game_list.add(new Game("God of War", 39.99));
        game_list.add(new Game("Grand Theft Auto V", 29.99));
        game_list.add(new Game("Hades", 24.99));
        game_list.add(new Game("Marvel's Spider-Man", 49.99));
        game_list.add(new Game("Max Payne 3", 19.99));
        game_list.add(new Game("Red Dead Redemption 2", 54.99));
        game_list.add(new Game("Resident Evil 4", 29.99));
        game_list.add(new Game("Starfield", 59.99));
        game_list.add(new Game("The Elder Scrolls V: Skyrim", 39.99));
        game_list.add(new Game("The Last of Us", 49.99));
        game_list.add(new Game("The Witcher 3", 39.99));

    }

    public ArrayList<Game> get_game_list() {

        return game_list;

    }
}
