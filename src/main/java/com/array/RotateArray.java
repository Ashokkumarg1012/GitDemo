package com.array;

public class RotateArray {
    public static void main(String[] args){
        int[] input = {1,2,3,4,5};
        int rotate = 2;

        for(int i=0;i<rotate;i++){
            int last = input[input.length-1];
            for(int j=input.length-1;j>0;j--){
                input[j]=input[j-1];

            }
            input[0]=last;
        }

        for(int x:input){
            System.out.print(x+" ");
        }
    }
}
