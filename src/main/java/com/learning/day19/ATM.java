package com.learning.day19;

public class ATM {

    public void withdraw(int money) throws Only100sException, MinWithdrawAmount {
        if(money < 50){
            throw  new MinWithdrawAmount("Please enter min 50$ for withdraw.");
        }
        if(money % 100 != 0){
            throw new Only100sException("Please Enter only 100's bill");
        }
            System.out.println("Take your "+ money+ "$");

    }
}
