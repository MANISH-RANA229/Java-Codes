package com.java;

import java.util.*;

public class sum_of_all_odd_no {

    public static int oddSum(int n){
       int sum = 0;
     for(int i= 0;i<=n;i++){
         
        if(i % 2 ==0){

           sum = sum +i;
        }


          }
     
        return sum;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = oddSum(n);
        System.out.println(sum);
    }

}
