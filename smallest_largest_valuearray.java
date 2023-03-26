package com.java;
//import java.util.*;
public class smallest_largest_valuearray {

    


public static void largest(int marks[]){
   int largest =Integer.MIN_VALUE;
   int smallest = Integer.MAX_VALUE;


   for(int i =0;i<marks.length;i++){
     if( marks[i]>largest){

        largest =marks[i];
     }
   

   }System.out.println("The largest value is" + largest);

   for(int i =0;i<marks.length;i++){
    if( marks[i]<smallest){

       smallest =marks[i];
    }
    
    

  }System.out.println("The smallest value is" + smallest);







    
}


     public static void main(String[] args) {
        
    int marks[] = {23,45,67,89,80};
    largest(marks);
        
    }
    
}
