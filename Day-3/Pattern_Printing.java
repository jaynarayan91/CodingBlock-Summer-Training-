import java.util.*;

public class Pattern_Printing {
    public static void main(String[] args) {
        // int n = 5;

        // for(int i=0; i<10; i++){
        //     System.out.println("Read");
        //     if(i<5){
        //         System.out.println(i);
        //     }else
                //  continue;
        //         break;
        //          System.out.println("Not Read");
        // }

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //     System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Output: 
        /* 
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){ 
        //     System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
        //Output:

        /*
         * 
         * *
         * * *
         * * * *
         * * * * *
        */

        // for(int i=n; i>0; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        // }
        // System.out.println();
        // }

        //Output:

        /*
         * * * * *
         * * * *
         * * *
         * *
         * 
         */

        //  for(int i=1; i<=n; i++){
        //     for(int j=n; j>i; j--){
        //         System.out.print("  ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //  }

        //Output:

        /*
                  *
                * *
              * * *
            * * * *
          * * * * *  
         */

        //  for(int i=n; i>0; i--){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //  }

        //Output:

        /*
         * * * * *
           * * * *
             * * *
               * *
                 *
         */

        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=2*(n-i); j++){
        //         System.out.print("  ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Output:

        /*
         * * * * *
             * * * *
                 * * *
                     * *
                         *
         */

       

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         if(i==0 || i==n-1 || j==0 || j==n-1){
        //              System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Output:

        /*
         * * * * *
         *       *
         *       *
         *       *
         * * * * *
         */

      //    for(int i=0; i<=n; i++){
      //     for(int j=0; j<=n; j++){
      //         if(i==j || n-i+1==j){
      //              System.out.print("* ");
      //         }else{
      //             System.out.print("  ");
      //         }
      //     }
      //     System.out.println();
      // }

      // Output:

      /*
       *                *
          *          *
             *    *
                *
             *     *
          *           *
       *                 *
       */

      //  int n=5;

      //    for(int i=1; i<=n; i++){
      //     for(int k=1; k<=n-i; k++){
      //       System.out.print("  ");
      //     }
      //     for(int j=1; j<=i; j++){
      //       System.out.print("* ");
      //     }

      //     for(int j=1; j<=i-1; j++){
      //       System.out.print("* ");
      //     }
      //     System.out.println();
      //   }


         //Output:

         /*
                *
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * *
          */

        //  for(int i=1; i<=n; i++){
        //   for(int j=1; j<=i; j++){
        //     System.out.print("* ");
        //   }
        //   System.out.println();
        //  }

        //  for(int i=n-1; i>=1; i--){
        //   for(int j=1; j<=i; j++){
        //     System.out.print("* ");
        //   }
        //   System.out.println();
        //  }

         //Output:

         /*
          * 
          * *
          * * *
          * * * *
          * * * * *
          * * * *
          * * *
          * *
          *
          */

        //    for(int i=n; i>=1; i--){
        //     for(int j=1; j<=n-i; j++){
        //       System.out.print("  ");
        //     }
        //     for(int k=1; k<=i; k++){
        //       System.out.print("* ");
        //   }
        //   for(int j=1; j<=i-1; j++){
        //     System.out.print("* ");
        //   }
        //   System.out.println();
        // }

        // Output:
        /*
         * * * * * * * * *
           * * * * * * *
             * * * * * 
               * * *
                 *
         */

        //  int n=5;

        // for(int i=n; i>=1; i--){
        //   for(int k=1; k<=2*(n-i); k++){
        //     System.out.print("  ");
        //   }
        //     for(int j=1; j<=i; j++){
        //       System.out.print("* ");
        //     }
        //     System.out.println();
        //   }

        //   for(int i=2; i<=n; i++){
        //     for(int k=1; k<=2*(n-i); k++){
        //       System.out.print("  ");
        //   }
        //   for(int j=1; j<=i; j++){
        //     System.out.print("* ");
        //   }
        //   System.out.println();
        // }

        //Output:-

/* 
* * * * * 
    * * * *
        * * *
            * *
                *
            * *
        * * *
    * * * *
* * * * *   

*/

// Scanner sc = new Scanner(System.in);
// int N = sc.nextInt();

// for(int i=1; i<=N; i++){
//   for(int k=1; k<=2*(N-i); k++){
//     System.out.print("  ");
//   }
//   for(int j=i; j>=1; j--){
//     System.out.print(j + " ");
//   }
//   for(int j=2; j<=i; j++){
//     System.out.print(j + " ");
//   }
//   System.out.println();
// }

//  // Loop through rows
//  for (int i = 1; i <= N; i++) {
//   // Print spaces
//   for (int j = 1; j <= 2 * (N - i); j++) {
//       System.out.print(" ");
//   }

//   // Print numbers in increasing order
//   for (int j = i; j <= 2 * i - 1; j++) {
//       System.out.print(j + " ");
//   }

//   // Print numbers in decreasing order
//   for (int j = 2 * i - 2; j >= i; j--) {
//       System.out.print(j + " ");
//   }

//   // Move to the next line
//   System.out.println();
// }

      // int n = 4;

        //   for(int i=1; i<=n; i++){
        //     for(int k=1; k<=n-i; k++){
        //       System.out.print("  ");
        //     }
        //     for(int j=1; j<=i; j++){
        //       System.out.print("* ");
        //     }
        //     for(int j=1; j<=i-1; j++){
        //       System.out.print("* ");
        //     }
        //     System.out.println();
        //   }
        //   for(int i=n-1; i>=1; i--){
        //     for(int k=1; k<=n-i; k++){
        //       System.out.print("  ");
        //     }
        //     for(int j=1; j<=i; j++){
        //       System.out.print("* ");
        //     }
        //     for(int j=1; j<=i-1; j++){
        //       System.out.print("* ");
        //     }
        //     System.out.println();
        //   }

        // Output:-

        /*
                   *
                *  *  *
             *  *  *  *  * 
          *  *  *  *  *  *  *
             *  *  *  *  *
                *  *  *
                   * 
         */


        //  int n=5;

        //  for(int i=1; i<=n; i++){
        //   for(int k=1; k<=n-i; k++){
        //     System.out.print("  ");
        //   }
        //   for(int j=1; j<=i; j++){
        //     if(j%2==0){
        //     System.out.print("  ");
        //     }else{
        //       System.out.print("* ");
        //     }
        //   }
        //   for(int j=1; j<=i-1; j++){
        //     if((i+j)%2==0){
        //       System.out.print("  ");
        //     }else{
        //       System.out.print("* ");
        //     }
        //   }
        //   System.out.println();
        //  }

        // Output:-

        /*
                        *
                      *   *
                    *   *   *
                  *   *   *   *
                *   *   *   *   *
         */

        //  int n=5;

        //  for(int i=1; i<=n; i++){
        //   for(int k=1; k<=n-i; k++){
        //     System.out.print("  ");
        //   }
        //   for(int j=1; j<=i; j++){
        //     System.out.print("* ");
        //   }
        //   System.out.println();
        //  }

        //  for(int i=n-1; i>=1; i--){
        //   for(int k=1; k<=n-i; k++){
        //     System.out.print("  ");
        //   }
        //   for(int j=1; j<=i; j++){
        //     System.out.print("* ");
        //   }
        //   System.out.println();
        //  }

        // Output:- 

        /*
                  *  
                * *
              * * *
            * * * *
          * * * * *
            * * * *
              * * *
                * *
                  *
         */

          int n=5;

        for(int i=n; i>=1; i--){
         for(int k=1; k<=2*(n-i); k++){
            System.out.print("  ");
          }
            for(int j=1; j<=i; j++){
              System.out.print("* ");
            }
            System.out.println();
          }

          for(int i=2; i<=n; i++){
            for(int k=1; k<=2*(n-i); k++){
              System.out.print("  ");
          }
          for(int j=1; j<=i; j++){
            System.out.print("* ");
          }
          System.out.println();
        }

        
          }
  }   



