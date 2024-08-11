package com.learning.day19;

public class ThreadsIntro {

    public static void main(String[] args) throws InterruptedException {

        // Threads
//	-> spatate execution flow that divide the stack allowing for concurrent processing in a
//	  java application.
//	-> this allows faster processing in cases where the processes need not happen linearly.
//	 -> generally order of multiple threads is not possible.

//	Threads life cycle states =>
//	New:  This the state of a new thread object that has not started executing yet.
//	Runnable: (running) the thread has started.
//	Blocked: A thread is waiting on a synchronized resource being used by another thread.
//	Waiting: A thread is paused for an unspecified amount of time.
//	Timed_waiting: The thread is paused for a specified amount of time.
//	Terminated: the thread execution has finished.

        //	Thread Methods :
//	.run() =>  the run method is the actual processes that will be run by the thread.
//	.start() => actually tells the JVM to create a execution flow in the stack and then run the run method in that flow.
//	.join() => puts a thread into waiting for another thread to complete, when this merges threads
//	.isAlive() => gives the state of the thread
//	Thread.currentThread() => gives the thread methods are currently being run by.
//	Thread.sleep(ms) => thread is waiting for a specified amount of time.


        //	 Creating a Threads -> there are two ways
//	 1. Extending the Thread class and overriding the run() method can create a Thread object.
//	 2. Implementing the Runnable interface will also allow you to create a Thread.
//	    => single abstract method => run()



        MyThreadExample t1 = new MyThreadExample();
        t1.start();
        System.out.println(t1.isAlive());

         t1.sleep(3000);
        System.out.println(t1.isAlive());
    }
}
