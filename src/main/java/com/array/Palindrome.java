package com.array;

public class Palindrome {
    public static void main(String args[]){
        String word1 = "CiviC";
        System.out.print(palindrome(word1));
    }
    public static Boolean palindrome(String word){
        int start = 0;
        int end = word.length()-1;
        while (start<end){
            if(word.charAt(start)!=word.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
