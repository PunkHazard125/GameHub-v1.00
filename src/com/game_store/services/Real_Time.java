package com.game_store.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Real_Time {

    public static String getRealTime() {

        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss yyyy");
        return currentTime.format(formatter);

    }
}
