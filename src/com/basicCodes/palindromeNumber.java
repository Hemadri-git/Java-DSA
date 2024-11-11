package com.basicCodes;
import java.util.Scanner;
public class palindromeNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int number = sc.nextInt();
        int sum = 0;

        int temp = number;
        while (temp>0){
            int rem = temp%10;
            sum = sum*10 + rem;
            temp/=10;
        }
        if (number == sum){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

    }
}
