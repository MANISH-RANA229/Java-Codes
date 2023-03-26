package com.java;

import java.util.*;

public class loops_table{

public static void main(String[] args){

try (Scanner sc = new Scanner("Enter the number")) {
    int a = sc.nextInt();
    
    
    int sum = 0;
    
    
    for(int i=0; i<=10;i++ ){
    
        sum = a*i;
        System.out.println(sum);
    }
}

}

}