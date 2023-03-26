package com.java;

import java.util.Scanner;

public class no_average{

public static int average(int a,int b,int c){

    int ave = (a+b+c)/3;
    System.out.println(ave);
    return ave;
}



    public static void main(String args []){

       try (Scanner sc = new Scanner(System.in)) {
        int a = sc.nextInt();
           int b = sc.nextInt();
            int c = sc.nextInt();


            average(a, b,c);
            
    }



    }
    
}
