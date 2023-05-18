package com.practical.thread;

public class CarActivites extends Thread {
    private String activityName;

    public CarActivites(String activityName) {
        this.activityName = activityName;
    }

    @Override
    public void run() {
        System.out.println(currentThread().getName() + ":-Currently " + activityName + " has started");
        for (int i = 0; i < 3; i++) {
            System.out.println(currentThread().getName() + ":-executing " + activityName + " , execution time in seconds:" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(currentThread().getName() + ":-" + activityName + " : task completed");
    }
}
