package com.learning.day7and8and9;

public interface Vehicle {

    void start();
    void stop();
    void drive();
    void speedupBy(int speed);
    void slowdownBy(int speed);
    int getSpeed();
}
