package com.learning.day7and8and9;

public class Calculator {


    public int sum(){
        return 10+20;
    }
    public int sum(int a, int b){
        return a+b;
    }

    public double sum (double a, double b){
        return a+b;
    }
    public double sum (double a, int b){
        return a+b;
    }
    public double sum (int a, double b){
        return a+b;
    }

    public double sum (double a, double b, int c){
        return a+b+c;
    }

    public double sum (double a, int b, int c){
        return a+b+c;
    }

    public double mul (double a, int b, int c){
        return a*b*c;
    }

}
