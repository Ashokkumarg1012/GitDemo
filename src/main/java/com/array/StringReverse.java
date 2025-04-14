package com.array;

public class StringReverse {

    public static void main(String args[]){
        String x = "City";

        System.out.println(strRev(x));



    }

    public static String strRev(String str){
        StringBuilder s = new StringBuilder();

        for(int i = str.length()-1;i>=0;i--){
            s.append(str.charAt(i));
        }
        return s.toString();
    }
}
