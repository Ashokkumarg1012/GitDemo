package com.array;

public class ExceptionHandling {

    public static void main(String args[]){
        int j=0,i=2;
        int k=0;
        try{
            k=i/j;
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }

        System.out.println("k is "+k);
    }
}
