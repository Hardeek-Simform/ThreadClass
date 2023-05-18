package com.practical.thread;

public class CarActivites extends Thread {
    private String activityName;
    private int requiredTime;

    public CarActivites(String activityName, int requiredTime) {
        this.activityName = activityName;
        this.requiredTime = requiredTime;
    }

    @Override
    public void run() {
        System.out.println(currentThread().getName() + ":-Currently " + activityName + " has started");
        while (requiredTime >= 0) {
            try {
                requiredTime--;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(currentThread().getName() + ":-" + activityName + " : task completed");
    }
}
