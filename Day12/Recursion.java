
public class Recursion {

    /*
     * Function calling itself is called Recursion!
     */

    /*
     * Example of recursion:- factorial of number!
     */
    public static int factorial(int n) {
        if (n == 1)
            return 1; // **This is called base case!
        int fact = n * factorial(n - 1); // **This is main logic!
        return fact;
    }

    /*
     * Difference between iterative call and recursive call
     */

    // Iterative call
    // public static int powerFunction(int n, int p){
    // int result = 1;
    // for(int i=1;i<=p;i++){
    // result = result * n;
    // }
    // return result;
    // }

    // Recursive call
    // public static int powerFunction(int n, int p){
    // if(p==0) return 1;
    // int ans = n * powerFunction(n, p-1);
    // return ans;
    // }

    /*
     * There are two types of recursion:- 1.Head Recursion 2.Tail Recursion
     */

    // tail recursion of factorial

    // static int fact2(int n, int ans){
    // if(n==0) return ans;
    // return fact2(n-1, n*ans);
    // }

    // fibonacci Series by iterative call
    // public static int fibonacci(int n) {
    //     int a = 0, b = 1, c = 0;
    //     for (int i = 2; i <= n; i++) {
    //         c = a + b;
    //         a = b;
    //         b = c;
    //     }
    //     return c;
    // }

    // fibonacci series by recursive call
    // public static int fibonacci(int n){
    //     if(n==0 || n==1) return n;
    //     return fibonacci(n-1) + fibonacci(n-2);
    // }

    // Sub-Sequence using recursion

    public static void subSeq(String s, String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);

        //including ch in ans
        subSeq(s.substring(1), ans+ch);

        // excluding ch on ans
        subSeq(s.substring(1), ans);

    }

   

    public static void main(String[] args) {
        // int n=5;
        // int p=3;
        // System.out.print(factorial(n));
        // System.out.print(powerFunction(n,p));
        // System.out.print(fact2(4,1));
        // System.out.print(fibonacci(4));
        // subSeq("CAR", "");
        

    }
}
