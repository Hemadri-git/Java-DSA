package com.demo;
import java.util.*;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];

        for(int i = 0; i<n; i++){
            num[i] = sc.nextInt();
        }

        for(int i = 0; i<n; i++){
            System.out.print(num[i]);
        }
    }
}