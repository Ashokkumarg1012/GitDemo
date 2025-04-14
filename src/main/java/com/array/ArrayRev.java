package com.array;

import java.util.Arrays;

public class ArrayRev {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
        int[] result = revArr(arr);

        for (int i=0;i<result.length;i++) {
            System.out.print(result[i]+ " ");

        }
        System.out.println(" ");
 //       System.out.println(Arrays.toString(result));
    }

    public static int[] revArr(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int tmp = 0;
        while(start<end){
            tmp = arr[start];
            arr[start]=arr[end];
            arr[end]=tmp;
            start++;
            end--;
        }
        return arr;
    }


}
