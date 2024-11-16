package com.array;
//2114. Maximum Number of Words Found in Sentences
public class maxNoOfWords2114
{
    public static void main(String[] args) {
       String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
       int ans = 0;

       for(int i =0; i<sentences.length; i++){
           String s = sentences[i];
           int temp = 1;

           for(int j = 0; j<s.length(); j++){
               if(s.charAt(j) == ' '){
                   temp++;
               }
           }
           ans = Math.max(temp, ans);

       }

        System.out.println(ans);
    }

}
