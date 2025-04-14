package com.array;

public class Reverse {
    public static void main(String args[]){
        String s = "abcd xyz pqrs";
        System.out.print(s);
        System.out.println(" ");
        System.out.println(rev(s));

        revWord(s);

    }
    public static String rev(String input){
        String output = "";
        for(int i=input.length()-1; i>=0;i--){

            output+=input.charAt(i);
        }
        return output;
    }

    public static void revWord(String word){
        String[] opArray = word.split(" ");
        for(int i=0;i<= opArray.length-1;i++){
            String op = "";

            for(int j=opArray[i].length()-1;j>=0;j--){
                op+=opArray[i].charAt(j);
            }

            System.out.print(op);
            System.out.print(" ");
//            System.out.println(opArray[i]);
        }
    }
}