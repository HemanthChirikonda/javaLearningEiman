package com.learning.day11;

import java.util.Arrays;

public class Orders {
    int id =0;
    int productIndex=0;
    String[] products = new String[3];
    Person  person;

    public Orders(){
         id = id++;
    }

    public void addProductToOrder(String productName){
       if(productIndex < products.length){
           products[productIndex] = productName;
           productIndex++;
       }else{
           System.out.println("Order is full");
       }
    }

    public void addNewPersonToOrder(Person person){
        this.person = person;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", productCount=" + productIndex +
                ", products=" + Arrays.toString(products) +
                ", person=" + person +
                '}';
    }
}
