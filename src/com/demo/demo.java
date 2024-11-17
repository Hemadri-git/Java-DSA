package com.demo;
import java.sql.SQLOutput;
import  java.util.Scanner;
public class demo
{
    public static void main(String[] args) {

        int length = 5;

        for (int i = 0; i < length; i++){
            for (int j =0; j <length; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}