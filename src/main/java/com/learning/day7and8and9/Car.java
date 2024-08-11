package com.learning.day7and8and9;

public class Car implements Vehicle{

    private int speed;
    @Override
    public void start() {
        System.out.println("My car started");
        speed= speed+10;
    }

    @Override
    public void stop() {
        System.out.println("My car stopped");
    }

    @Override
    public void drive() {
        System.out.println("My car is in drive mode");
    }

    @Override
    public void speedupBy(int speed) {
          this.speed = this.speed+speed;
    }

    @Override
    public void slowdownBy(int speed) {
        this.speed = this.speed-speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
