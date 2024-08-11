package com.learning.day7and8and9;

public class FourPillersOfJava {

    //		1. Encapsulation
    // 		2. Inheritance
    // 		3. Polymorphism
    // 		4. Abstraction



    //		1. Encapsulation

//		Encapsulation is to make sure that "sensitive" data is hidden from the users.
//		1. declear class variables / attributes as private.
//		2. we will create a set or get methods to access or update the values of variables / attributes.


    // User => usename and password
    // User => user.username, user.password
//          => user.getUsername(), user.getPassword() => auth logic => if you are authorized then return the values or don't



    //		2. Inheritance

//		it's possible to inherit attributes and methods from one  class to another class.
//		1. subclass or child class -> class that inherits from [another class]<-(This will be the parent class or "super class" for this child or sub class).
//		2. super class or parent class -> -------------------------------------------

    // "super" keyword is used to access the parent methods or attributes.

    // To inherit from one class to another class, we will use a keyword called "extends".

    // For all the objects in java, parent class is Object class.


    // 1. Single Inheritance      A -> B
//		                              A -> C
    // 2. Multi-level Inheritance    A -> B -> C
    // 3. Multiple Inheritance     Father  A  \ -> C
//		                               Mother  B  / -> C
//		Java Classes does not support Multiple Inheritance

//		   4. Hierarchical Inheritance
//		   5. Hybrid Inheritance  ->  not supported

    // Bank Account -> accountNumber, routingNumber, name, ssn, address, email, phoneNumber
    // Checkings Account -> apRrate, minBalance, maxLimit
    // Savings Account   -> noOfTansectionsLimit;




    //		3. Polymorphism => Many forms.
    // 		Poly     -> Many
    // 		morphism  -> forms
    //		1. Compile time Polymorphism - Method Overloading
    //		2. Run time Polymorphism  - Method overriding

    //		1. Method Overloading
    // 		    method name -> same
    // 		    different number of parameters with same datatype
    // 		    different datatypes with same number of parameters
    // 		    within the same class.

    //		2. Method Overriding
    // 		@Override
    // 		Method Overriding will be used when there are two classes haiving a Inheritance relationship
    // 		and both are having same method with different implementation.



    //		4. Abstraction
    // 		Abstraction is a process of hiding the certain details and showing only essentional information to the user.
    // 		Abstraction -> hiding the implementation.

    ////		 1. By using abstact classes
    ////		 2. Interfaces.
    ////		 3. Private methods

    //		-> what is abstract class ?
    // 		-> we will use keyword "abstract".
    // 		-> we can not create the object by using abstract class.
    // 		-> Abstract methods can only be used in side a abstarct class  -> abstract methods will not have a body.
    // 		-> Abstract Classes can have both regular methods and Abstract methods.
    // 		-> whatever class that is extending from abstract class needs o provide the implementation for abstract methods.


//    what is Interface ?
    // this is another way to achieve abstraction.
//      An interface is a completely abstract class, only abstract methods are allowed.
// 	    to access the interface methods, the interface must be implemented  by another class,
//	    we use a keyword "implements"
//      In java 8 onwards, default methods in interface, this only, we need to use "default" keyword.

//    rules:
//    Interface can not be used to create objects.
//    interface will be having only abstract methods, after java 8 default methods too.
//    when any class implementation an interface, that class must provide the implementation for all its abstract methods.
//    In Interface -> methods => by default -> public, attributes are static and final.
//    In interface can not contain a constructor.

//    By suing interfaces we can implement the Multiple Inheritance.


    // child => class A  , class B  => getMYPlan();  => A => today no plans, B => go to a movie,  => it's not supported.
    // child=> Interface A, Interface B => A, B=>  getMYPlan() => no implementation  => it's supported.


    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setName("eiman", true);

        System.out.println(account1.getName());

        CheckingsAccount ca = new CheckingsAccount();
        SavingsAccount sa = new SavingsAccount();

       Calculator calc = new Calculator();
        System.out.println(calc.sum());
        System.out.println(calc.sum(22,55));
        System.out.println(calc.sum(12,13));
        System.out.println(calc.sum(12.6,44.678));
        System.out.println(calc.sum(12.6,44.678, 10));
        System.out.println(calc.sum(12.8,18, 10));

        Parent p = new Parent();
        p.style();

        Child c = new Child();
        c.style();

        AbstractLoanCalculatorClass lc = LoanBuilder.build("home");
        lc.showTheBestRatesForMyLoan(12345678, "eiman", "c1467821", 60);

        AbstractLoanCalculatorClass ac = LoanBuilder.build("auto");
        ac.showTheBestRatesForMyLoan(12345678, "eiman", "c1467821", 60);

        AbstractLoanCalculatorClass pc = LoanBuilder.build("");
        pc.showTheBestRatesForMyLoan(12345678, "eiman", "c1467821", 60);


        Vehicle car1 = new Car();
        car1.start();
        car1.drive();
        car1.speedupBy(15);
        System.out.println(   car1.getSpeed());
        car1.slowdownBy(10);
        System.out.println(   car1.getSpeed());
        car1.stop();

        System.out.println(car1);



    }
}
