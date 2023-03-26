/*package com.java;

import java.util.*;

public class conditional {

    public static void main(String[] args){


       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();

       if(a>15){


        System.out.println("you are adult");

        
       }

       else {

        System.out.println("you are not adult");


       }







    }
    
}
 */

/*package com.java;

import java.util.*;

public class conditional {

    public static void main(String[] args){


       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();

       if(a%2==0){


        System.out.println("even");

        
       }

       else {

        System.out.println("odd");


       }







    }
    
}*/

/*package com.java;

import java.util.*;

public class conditional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {

            System.out.println("equal");

        }

        if (a < b) {

            System.out.print("lesser");
        }

        else {

            System.out.println("greater");

        }

    }

}*/


package com.java;

import java.util.*;

public class conditional {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            

            

            if (a < b) {

                System.out.print("lesser");
            }

            else if(a>b) {

                System.out.println("greater");

            }

            else{
                System.out.println("equal");
            }
        }

    }

}
