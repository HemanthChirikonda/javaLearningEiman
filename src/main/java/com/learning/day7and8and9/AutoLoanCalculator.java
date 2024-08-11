package com.learning.day7and8and9;

public class AutoLoanCalculator extends  AbstractLoanCalculatorClass{


    @Override
    public void showTheBestRatesForMyLoan(int ssn, String name, String idNumber, int noOfMonths) {
        System.out.println("Hi " + name+"'s best rate for this Auto loan is "+ getAutoFinalDecision(ssn,idNumber,noOfMonths));
    }


    private double getAutoFinalDecision(int ssn, String idNumber, int noOfMonths){

        // Different Logic than Home and Personal
        return  makeFinaldecision(ssn, idNumber, noOfMonths);
    }


}
