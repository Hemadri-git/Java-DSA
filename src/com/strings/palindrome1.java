package com.strings;

public class palindrome1
{
    public static void main(String[] args) {
        String name = "mam";
        String ans = "";
        int n = name.length()-1;

        for(int i = n; i>=0; i--){
            ans = ans + name.charAt(i);
        }

        if (ans.equals(name)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
