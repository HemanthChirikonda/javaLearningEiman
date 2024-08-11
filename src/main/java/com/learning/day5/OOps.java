package com.learning.day5;

public class OOps {
    public static void main(String[] args) {

        //		OOPS - > OBJECT ORIENTED PROGRAMMING
        //		Main Componentes
        // 		  -> Classes
        // 		  -> Objects


        //		Classes => What is class ?
        //		Class is a template or blueprint for creating objects

        //		Class -> 1. Attributes
        //		      -> 2. Methods

        //		      1. Attributes => are decleared with in a class, variables with in a class
        //		      2. Methods  => are decleared with in a class,  these are used to perfrom certain actions.


        // Class         =>      Object

        // car           =>      toyota, volvo,

        // car => attributes => color, barnd, mpg, millage, price, owner, regNo;
//             => methods =>  driver(), break(), fillGas(), sevice(), checkCarWashStatus()

        // Person        =>    eiman, hemanth, .........

        // Person => attributes => face, noOfLegs, noOfHands, hairColor, IQ.
        //           methods   => sleep(), eat(), talk()
//--------------------------------------------------------------------------------------------------------------------------


        // how to create a class ?

        //  public class   className{
        // int a =10; => attribute of the class
        // body of the class

        // }


        // How to create a Object using class ?

//        className   objRefName  = new className();
        Car toyota = new Car("blue", "toyota");
//        toyota.color = "blue";
        toyota.owner = "eiman";
        toyota.price = 35000;
        toyota.mpg = 28;
        toyota.millage = 250;
//        toyota.barnd= "toyota";

        System.out.println(toyota.color);

        Car toyota2 = new Car("red", "tayota2");
//        toyota2.color = "red";
        toyota2.owner = "hemanth";
        toyota2.price = 35000;
        toyota2.mpg = 28;
        toyota2.millage = 250;


        System.out.println(toyota2.color);

        toyota.drive();
        toyota2.drive();

       String outputColor = toyota.getColor();

//		House > has Attributes- > type, address, noRooms, age, owner , price
//		      > has Methods -> rent(), sell(), buy(), remodel(), changePrice(updatedPrice)


//		Tv -> has Attributes -> type, model, os, size, mfgYear, specs, color
//		      has Methods -> changeChannel(), switch(), operations(), volume()


//		ClassRoom -> noOfStudents, type, mode, course, status
//		          -> status(),


        // How to create a method?

        // accessModifyer returnType  methodName(){
              //body of method
              //return returnTypeValue;
        // }

        // how can we call a method ?

        // objectReference.methodName();

//  if you have void return type then we dont need to add return keyword inside method
    }

    // simple method
    public void add(){
        System.out.println("This is add method");
    }

    //how to use return type in method
    public int sub(){
        System.out.println("This is sub method");
        return 1;
    }

    //how to pass a input to a method

    public int mul(int a, int b){
       return a*b;
    }

}
