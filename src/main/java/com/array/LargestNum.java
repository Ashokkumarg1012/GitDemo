package com.array;

public class LargestNum {
    public static void main(String args[]){
        int[] arr = {1,2,4,5,1,29,3,4};
        System.out.println(largest(arr));

    }
    public static int largest(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
