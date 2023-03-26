package com.java;

public class pass_by_refrence {

    public static void array(int arr[] ,int a ){
      for(int i=0;i<arr.length;i++){
        arr[i] = arr[i]+1;
        
      }
         a = 19;
       
    }

public static void main(String[]args){
      int arr [] = {34,45,45};
     int a = 10;
      array(arr,a);
      for(int i = 0;i<arr.length;i++){
    System.out.println(arr[i] +"");

      }
      System.out.println(key);

}





    
}
