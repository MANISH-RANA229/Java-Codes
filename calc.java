package com.java;
import java.util.*;
public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int a = sc.nextInt();
        int b = sc.nextInt();
        String name = sc.next();

        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;  
      

        if(name == "sum"){
            System.out.println(sum);
        }
        else if (name == "sub"){
            System.out.println(sub);
        }
        else if(name == "mul"){
            System.out.println(mul);
        }
        else{
            System.out.println(div);
        }
    }
    
} 
