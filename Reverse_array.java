package com.java;

public class Reverse_array {

  public static void Reverse(int array[]) {
    int start = 0; int last = array.length-1;

    while(start<last){

    int temp = array[last];
    array[last]= array[start];
    array[start]= temp;
    

    start++;
    last--;



    }
    for(int i = 0;i<array.length;i++){

        

        System.out.println("the reverse array is "+array[i] +" ");
        }


    
  
    
  }






     public static void main(String[] args) {
        
    int array [] = {2,3,4,5,67,8,9,10};
    Reverse(array);

   
        
    }
    
}
