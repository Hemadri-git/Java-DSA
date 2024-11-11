package com.basicCodes;
import java.util.Scanner;

public class realWorld1
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();


        if(name.equals("boy")){
            System.out.println("Go left side");
        } else if (name.equals("girl")) {
            System.out.println("Go right side");
        }
        else {
            System.out.println("invalid input");
        }
    }
}
