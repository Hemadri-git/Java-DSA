package com.basicCodes;

public class panlindromeString
{
    public static void main(String[] args) {
        String s = "markram";
        boolean palindrome = true;
        int length = s.length();

        for(int i = 0; i<length/2; i++){
            if (s.charAt(i) != s.charAt(length-i-1)){
                palindrome = false;
            }
        }

        if (palindrome == true){
            System.out.println("palindrome String");
        }
        else{
            System.out.println("Not an Palindrome String");
        }

    }
}
