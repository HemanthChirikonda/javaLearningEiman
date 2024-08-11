package com.learning.day19;

public class GCExample {

    @Override
    protected void finalize() throws Throwable  {
        System.out.println(" This Object is collected by GarbageCollector");
    }
}
