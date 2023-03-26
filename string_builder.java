package com.java;

public class string_builder {


    public static void main(String[]args){

   StringBuilder sb = new StringBuilder("Hello");

     System.out.println(sb);


     sb.insert(3,"M");
     System.out.println(sb);
     sb.delete(3,4);
     System.out.println(sb);
     sb.append("m");
     sb.append("a");
     sb.append("n");
     sb.append("i");
     sb.append("s");

     System.out.println(sb);
     System.out.println(sb.length());
    
     System.out.println( sb.charAt(4));
     



    }

    
}
