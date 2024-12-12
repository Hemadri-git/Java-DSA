package com.demo;

public class Test {
    public static void main(String[] args) {
        System.out.println("Thread starts sleeping...");
        try {
            Thread.sleep(6000, 500000); // Sleep for 2 seconds and 500,000 nanoseconds
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
        System.out.println("Thread wakes up");
    }
}
