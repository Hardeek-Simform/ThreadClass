package com.practical;

import com.practical.thread.CarActivites;

public class Main {
    public static void main(String[] args) {
        CarActivites headlight = new CarActivites("Head Light" , 1);
        headlight.start();
        CarActivites musicSystem = new CarActivites("Music System", 5);
        musicSystem.start();
        CarActivites indicator = new CarActivites("Indicator", 1);
        indicator.start();
        CarActivites wiper = new CarActivites("wiper", 3);
        wiper.start();
    }
}