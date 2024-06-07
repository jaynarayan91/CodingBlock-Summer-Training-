/*
 * *SYNTAX WITHOUT PARAMETER
 
 aModifier Return Type fName(){
    --Body of fn
    --return statement
 }

 **Ex:- 
 public static void printer(){
    System.out.println("Hello world");
 }
 */

 /*
  * *SYNTAX WITH PARAMETER

  aModifier ReturnType fName(dType Param1, dType Param2){
    --Body of fn
    --return statement
  }

  ** Ex:-
  public static void printer2(int a, int b){
    int sum = a+b;
    System.out.println(sum);
  }
  */



public class functions {
   

    // public static int product(int a, int b){
    //     int prod = a*b;
    //     return prod;
    // }

    // public static int sum(int a, int b){
    //     int s = a+b;
    //     return s;
    // }

    // public static void pattern(int n){
    //     for(int i=n; i>0; i--){
    //         for(int j=1; j<=n-i; j++ ){
    //         System.out.print("  ");
    //         }
    //         for(int k=1; k<=i; k++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }


    // }

    // public static void natural(int n){
    //     int sum=0;
    //     for(int i=1; i<=n; i++){
    //         sum += i;
    //         // sum = n*(n+1)/2;
    //     }
    //     System.out.println(sum +" ");
    // }

    // public static void printStar(int n){
    //     for(int i=n; i>=1; i--){
    //         for (int j=1; j<=i; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=i; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void printStar(int n){
        for(int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printStar(5);
    }
}

