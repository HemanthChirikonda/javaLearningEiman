package com.learning.day7and8and9;

public abstract class AbstractLoanCalculatorClass {


    public abstract  void showTheBestRatesForMyLoan(int ssn, String name, String idNumber, int noOfMonths);

    public  double makeFinaldecision(int ssn, String idNumber, int noOfMonths){
        int noOfLoans = checkAnyLoanOnThisSsn(ssn);
        int creditScore = checkCreditScoreandRepaymentHistory(ssn, idNumber);
        double possibleRateForReqMonths = checkPossiblerateForDifferentMonths(noOfMonths);
        // bussiness logic
        double bestrate = 5.45;

        return bestrate;

    }

    private int checkAnyLoanOnThisSsn(int ssn){

        //logic
        return 3;
    }

    private int checkCreditScoreandRepaymentHistory(int ssn, String idnumber){
        //logic
        return 720;
    }

    private double checkPossiblerateForDifferentMonths(int noOfMonths){
        if(noOfMonths == 36){
            return 3.5;
        }else if(noOfMonths ==48){
            return 4.8;
        }else if(noOfMonths == 60){
            return 5.8;
        }
        return 8;
    }


}
