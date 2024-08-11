package com.learning.day7and8and9;

public class LoanBuilder {

    public static AbstractLoanCalculatorClass build(String type){
        if(type.equalsIgnoreCase("home")){
            return new HomeLoanCalculator();
        }else if(type.equalsIgnoreCase("auto")){
            return new AutoLoanCalculator();
        }else{
            return new PersonalLoanCalculator();
        }
    }
}
