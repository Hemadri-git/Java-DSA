package com.demo;

public class demo
{
    public static void main(String[] args) {


        int r = 6;
        int c = 6;

        for (int i = 0; i<r; i++){
            for (int j = 0; j<c-i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j<c; j++){
                System.out.print("*");
            }
            for (int j = 0; j<c+i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}