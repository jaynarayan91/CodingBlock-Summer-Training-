package Day13;

public class RevisionRecur {

    // Recursion of coin flip

    public static void coinFlip(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        coinFlip(n - 1, ans + "H");
        coinFlip(n - 1, ans + "T");
    }

    // Recursion call coin flip without Two consecutive char repetition
    public static void coinStringRep(int n, String ans, char prev) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        coinStringRep(n-1, ans+"0", '0');
        if(prev != '1'){
            coinStringRep(n-1, ans+"1", '1');
        }
    }

    public static void printAsc(int n) {
        if (n == 0) {
            return;
        }
        printAsc(n - 1);
        System.out.println(n);
    }

    public static void printDesc(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printAsc(n - 1);
    }

    public static void printAscItr(int n, int i) {
        // Base Case
        if (i == n) {
            return;
        }
        // Process/Operation
        System.out.println(i);
        // Recursive Case/function call
        printAscItr(n, i + 1);
    }

    public static void printDescItr(int n, int i) {
        // Base Case
        if (i == n) {
            return;
        }
        // Recursive Case/function call
        printDescItr(n, i + 1);
        // Process/Operation
        System.out.println(i);

    }

    public static void reverseString(String s, int i, String rev){
        // i=0  => i=s.length()
        // if(i == s.length()){
        //     System.out.println(rev);
        //     return;
        //     }
        //     reverseString(s, i+1, s.charAt(i)+rev);  
            
            // i=s.length()  => i=0
            if(i<0){
                System.out.println(rev);
                return;
            }
            reverseString(s, i-1, rev+s.charAt(i));
    }

    // Iterative Call
    // public static float mean(int[] arr){
    //     int sum = 0;
    //     int length = arr.length;
    //     for(int i=0; i<length; i++){
    //         sum += arr[i];
    //         }
    //     return sum/length;
    // }

    // Recursive Call
    public static float mean(int[] num, int i){
        if(i==0) return num[i];
        return (mean(num, i-1)*i + num[i])/(float)(i+1);
    }


    public static void main(String[] args) {
        // coinFlip(3, "");
        // printAsc(10);
        // printDesc(10);
        // printAscItr(10, 0);
        // printDescItr(10, 0);
        // coinStringRep(3, "", '0');
        // reverseString("JAY", ("JAY").length()-1, "");
        int[] arr = {1,2,1};
        // System.out.print(mean(arr));
        System.out.println(mean(arr, arr.length-1));
    }

}
