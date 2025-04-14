package com.array;

public class MoveNumbersToEnd {
    public static void main(String args[]){
        int[] arr = new int[]{2,4,5,2,1,3,7,2};
        int common = 2;
        moveToRight(arr,common);

        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    public static void moveToRight(int[] arr,int c){
        int j=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=c){
                arr[j++]=arr[i];
            }
        }
        for(int i=j;i<arr.length;i++){
            arr[j++]=c;
        }

    }



}
