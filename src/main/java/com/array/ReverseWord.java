package com.array;

public class ReverseWord {
    public static void main(String args[]){
        System.out.println(revWords("Mango Orange Banana"));
        System.out.println(revEach("Puffs Chips Cake"));
        System.out.println(rev("Rain Rice Rum"));
        System.out.println(revBoth("Water Tap River"));

    }



    public static String revWords(String str){
        String[] words = str.split(" ");

        StringBuilder s = new StringBuilder();

        for(int i = words.length-1; i>=0;i--){
            s.append(words[i]).append(" ");
        }
        return s.toString().trim();

    }

    public static String rev(String str){
 //       StringBuilder s = new StringBuilder();
        String s = new String();
        for(int i = str.length()-1;i>=0; i--){
//            s.append(str.charAt(i));
            s=s+str.charAt(i);
        }
        return s;
    }


    public static String revEach(String str){
        String[] words = str.split(" ");
        String reverseWord = "";

        for(String st: words){
            StringBuilder s = new StringBuilder(st);
            s.reverse();
            reverseWord+=s.toString()+" ";

        }
        return reverseWord;

    }
    public static String revBoth(String str){
        String s = revEach(str);
        String sr = revWords(s);
        return sr;

    }


}
