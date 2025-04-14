package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        int[] arr = new int[] {4,1,9,4,5};
//
//        for(int i=0;i<arr.length; i++){
//            System.out.println(arr[i]);
//
//        }
//
//        for(int x:arr){
//            System.out.print(x);
//        }
        int[] arr=new int[]{3,8,14,1,7,4,2,13};
        reArrange(arr,8);
        for(int x:arr){
            System.out.print(x +" ");
        }

   }

    static void reArrange(int[] arr, int N) {
        // code here
        int[] ar = new int[N];
        int eind=0;
        int oind=1;

        for(int i=0;i<N;i++){
            if(arr[i]%2==0){
                ar[eind]=arr[i];
                eind+=2;
            }
            if(arr[i]%2!=0){
                ar[oind]=arr[i];
                oind+=2;
            }
        }

        for(int i=0;i<N;i++){
            arr[i]=ar[i];
        }
    }
}
