package com.java;
import java.util.*;

public class reverse_string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);

        for(int i =0;i<sb.length()/2;i++){

        int front = i;
        int back = sb.length()-i-1;

        char frontChar = sb.charAt(front);
        char backChar = sb.charAt(back);

        sb.setCharAt(front,backChar);
        sb.setCharAt(back,frontChar);

        System.out.println(sb);




        }



System.out.println(sb);


        



    
}





}



