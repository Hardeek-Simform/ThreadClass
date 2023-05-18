package com.practical;

import com.practical.thread.CarActivites;

public class Main {
    public static void main(String[] args) {
        CarActivites headlight = new CarActivites("Head Light");
        headlight.start();
        CarActivites musicSystem = new CarActivites("Music System");
        musicSystem.start();
        CarActivites indicator = new CarActivites("Indicator");
        indicator.start();
        CarActivites wiper = new CarActivites("wiper");
        wiper.start();
    }
}