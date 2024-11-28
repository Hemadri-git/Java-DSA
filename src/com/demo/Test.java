package com.demo;

public class Test {
    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 10};
        int n = arr.length;
        int loss = arr[0];
        int profit = 0;

        for (int i = 1; i < n; i++) {
            int temp = arr[i] - loss;
            profit = Math.max(temp, profit);
            loss = Math.min(arr[i], loss);
        }
        System.out.println(profit);
    }
}