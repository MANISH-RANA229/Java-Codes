package com.java;
//import java.io.*;
import java.util.*;
public class palindrome {


 public static boolean pal(String str) {

    for(int i = 0;i<str.length()/2;i++){

      int n = str.length();
    
        if (str.charAt(i) == str.charAt(n-i-1) ) {
            return true;
        
        } 
        
    
    }
     return false;
 }


    public static void main(String[]args){

    Scanner sc = new Scanner(System.in);

    String A = sc.next();
    if (pal(A)) {
        System.out.println("yes");
        
    } else {
        System.out.println("no");
        
    }
       // String B = new StringBuilder(A).reverse().toString();
       // if (A.equals(B)){
           // System.out.println("yes");

       // }
        //else{
           // System.out.println("no");
        //}


   //System.out.println(pal(str));


    }
    
}
