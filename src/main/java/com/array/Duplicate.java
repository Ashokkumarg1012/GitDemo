package com.array;

import java.util.*;

public class Duplicate {
    public static void main(String args[]){

        int[] arr = new int[]{1, 2, 3,3, 5,5,1};

//        for(int c:arr){
//            System.out.print(c);


         ArrayList<Integer> a = new ArrayList<>();
                 a = duplicates(arr,6);
        for(int x:a){
            System.out.println(x);
        }
    }
    public static ArrayList<Integer> duplicates(int[] arr, int a){
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num:arr){
            if(map.containsKey(num)){
                set.add(num);
            }
            else
                map.put(num,1);
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        if (list.size()>0)
            Collections.sort(list);
        else
            list.add(-1);

     return list;
    }


}
