package com.learning.day7and8and9;

public class CheckingsAccount extends BankAccount {

//    apRrate, minBalance, maxLimit

    private double aprRate;
    private double minBalance;
    private int maxLimit;

    public double getAprRate() {
        return aprRate;
    }

    public void setAprRate(double aprRate) {
        this.aprRate = aprRate;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public int getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(int maxLimit) {
        this.maxLimit = maxLimit;
    }
}
