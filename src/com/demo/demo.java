package com.demo;
import  java.util.Scanner;
public class demo
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        boolean palindrome = true;
        int len = name.length();//5
        int mid = len/2;//1 to 2

        for (int i = 0; i<mid; i++){
            if (name.charAt(i) != name.charAt(len-i-1)){
                palindrome = false;
                break;

            }
        }

        if (palindrome){
            System.out.println("palindrome ");
        }
        else
        {
            System.out.println("not a palindrome");
        }






    }
}