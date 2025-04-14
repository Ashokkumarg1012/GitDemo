package com.array;

public class ReverseNum {
    public static void main(String args[]){
        int x= 12356;
        System.out.println(revNum(x));
    }

    public static int revNum(int num){
        int reversedNum = 0;
        int remainder = 0;
        while(num>0){
            remainder = num%10;
            reversedNum=reversedNum*10+remainder;
            num=num/10;
        }
        return reversedNum;
    }

}
