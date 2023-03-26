package com.java;

        

    import java.util.*;

    public class anagram {
    
       
        public static boolean anagram(String S1,String S2) {
            S1=S1.toLowerCase();
            S1=S1.toLowerCase();
            char[] c1 = S1.toCharArray();
            char[] c2 =S2.toCharArray();
    
            if(c1.length ==c2.length){
    
              
                char temp =0;
                for(int i =0;i<c1.length;i++){
                  for(int j=i+1;j<c1.length;j++){
                    if(c1[i]>c1[j]){
                    temp = c1[i];
                   c1[i] =c1[j];
                   c1[j]=temp;
    
                    }
                  }
    
                }
                char vemp =0;
                for(int i =0;i<c2.length;i++){
                  for(int j=i+1;j<c2.length;j++){
                    if(c2[i]>c2[j]){
                    vemp = c2[i];
                   c2[i] =c2[j];
                   c2[j]=vemp;
    
                    }
                  }
    
                }
                for(int i=0;i<c1.length;i++){
                    if(c1[i]==c2[i]){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                for(int i=0;i<c1.length;i++){
                    System.out.println(c1[i]);
                    System.out.print(c2[i]);
                   }
              
               
               }
               return false;
            }
           
    
    
            
    
            
        
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String S1 = sc.next();
            //
          String S2 = sc.next();
    
    
           anagram(S1,S2);
          if(anagram(S1,S2)){
            System.out.println("Anagram");
           }
           else{
            System.out.println("Not Anagram");
           }
        }}