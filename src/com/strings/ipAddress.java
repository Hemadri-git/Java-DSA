package com.strings;
//1108. Defanging an IP Address, replcing . with [.]

public class ipAddress
{
    public static void main(String[] args) {
        String address = "1.1.1.1.1";
        int length = address.length();
        String ans = "";

        for (int i = 0; i<length; i++){

            if(address.charAt(i) != '.'){
                ans = ans + address.charAt(i);
            }
            else {
                ans = ans + "[.]";
            }
        }

        System.out.println(ans);

    }
}
