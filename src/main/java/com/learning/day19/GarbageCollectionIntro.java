package com.learning.day19;

public class GarbageCollectionIntro {
    public static void main(String[] args) {

//          GarbageCollection => component that many programming languages have, including Java,
////		                automatically manages memory by reclaiming memory occupied by objects that are no longer in use.

        String str1 = new String("This is String 1");

        str1 =null;

        GCExample gcEx = new GCExample();
        gcEx =null;

        GCExample gcEx1 = new GCExample();
        GCExample gcEx2 = new GCExample();
        GCExample gcEx3 = new GCExample();

        gcEx1 = null;
        gcEx2 = null;



        System.gc();

    }
}
