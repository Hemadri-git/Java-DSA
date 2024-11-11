package com.strings;

public class palindrome2
{
    public static void main(String[] args) {
        String name = "mam";
        int n = name.length();
        int mid = n/2;
        boolean palindrome = true;

        for (int i = 0; i<mid; i++){
            if (name.charAt(i) != name.charAt(n-i-1)){
                palindrome = false;
                break;
            }
        }

        if (palindrome){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }
}
