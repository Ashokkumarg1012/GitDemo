package com.array;

public class RotateRight {
    public static void main(String args[]){

        int[] arr={5,6,7,8};
        int d=1;

        for(int i=0;i<d;i++){
            int last = arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]= arr[j-1];

            }
            arr[0]=last;
        }

        for(int i:arr){
            System.out.print(i+" ");
        }



//        for(int i=0;i<d;i++){
//            int first = arr[0];
//            for(int j=1;j<arr.length-1;j++){
//                arr[j-1]=arr[j];
//            }
//            arr[arr.length-1]=first;
//
//
//        }
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
//
    }
}
