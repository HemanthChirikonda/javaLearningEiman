package com.learning.day7and8and9;

public class PersonalLoanCalculator extends AbstractLoanCalculatorClass{


    @Override
    public void showTheBestRatesForMyLoan(int ssn, String name, String idNumber, int noOfMonths) {
        System.out.println("Hi " + name+"'s best rate for this personal loan is "+ getPersonalFinalDecision(ssn,idNumber,noOfMonths));

    }


    private double getPersonalFinalDecision(int ssn, String idNumber, int noOfMonths){

        // Different Logic than Home and Auto
        return  makeFinaldecision(ssn, idNumber, noOfMonths)+1;
    }

}
