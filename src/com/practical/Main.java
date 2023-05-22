package com.practical;

import com.practical.thread.CarActivities;

public class Main {
    public static void main(String[] args) {
        CarActivities headlight = new CarActivities("Head Light", 1);
        headlight.start();
        CarActivities musicSystem = new CarActivities("Music System", 5);
        musicSystem.start();
        CarActivities indicator = new CarActivities("Indicator", 1);
        indicator.start();
        CarActivities wiper = new CarActivities("wiper", 3);
        wiper.start();
    }
}