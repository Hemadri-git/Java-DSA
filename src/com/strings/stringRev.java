package com.strings;

public class stringRev
{
    public static void main(String[] args) {

        String s = "mada";
        String ans = "";
        int n = s.length()-1;

        for(int i = n; i>=0; i--){
            ans = ans + s.charAt(i);
        }
        System.out.println(ans);
    }
}
