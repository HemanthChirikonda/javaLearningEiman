package com.learning.day7and8and9;

public class HomeLoanCalculator extends AbstractLoanCalculatorClass {


    @Override
    public void showTheBestRatesForMyLoan(int ssn, String name, String idNumber, int noOfMonths) {
        System.out.println("Hi " + name+"'s best rate for this home loan is "+ getHomeFinalDecision(ssn,idNumber,noOfMonths));
    }


    private double getHomeFinalDecision(int ssn, String idNumber, int noOfMonths){
        return  makeFinaldecision(ssn, idNumber, noOfMonths) -1;
    }

}
