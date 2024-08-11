package com.learning.day5;

public class Car {

    // POJO class => plain old java Object class

      public Car(){
          System.out.println("Car object is creating");
      }

    public Car(String color, String barnd){
          this.color = color;
          this.barnd = barnd;
        System.out.println("Car is creating with " + barnd);
    }

    String color;
    protected  String barnd;
    int mpg;
    int millage;
    double  price;
    String owner;
    String regNo;

    public void drive(){
        System.out.println(owner+"'s "+barnd + " " +  color +" car is in Drive mode");
    }

    public String getColor(){
        return color;
    }

}
