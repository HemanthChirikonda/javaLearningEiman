package com.learning.day7and8and9;

public class BankAccount {

   private  String name;
   private String ssn;
   private  String address;
   private  String phoneNumber;
   private String email;
   private int accountNumber;
   private int routingNumber;

   public String getName(){
       boolean auth = true;
     if(auth){
         return name;
     }else{
         return null;
     }
    }

    public void setName(String name, boolean auth){
       if(auth){
           this.name=name;
       }else{
           System.out.println("Your are not allowed");
       }
    }


    public String getSsn(){
       return  ssn;
    }


    public void setSsn(String ssn){
       this.ssn = ssn;
    }

    public String getAddress(){
       return address;
    }

    public void setAddress(String address){
       this.address= address;
    }

    public String getPhoneNumber(){
       return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
       this.phoneNumber = phoneNumber;
    }


    public String getEmail(){
       return  email;
    }


    public void setEmail(String email){
       this.email= email;
    }


    public int getAccountNumber(){
       return  accountNumber;
    }

    public void setAccountNumber(int accountNumber){
       this.accountNumber = accountNumber;
    }

    public int getRoutingNumber(){
       return routingNumber;
    }

    public  void setRoutingNumber(int routingNumber){
       this.routingNumber = routingNumber;
    }

}
