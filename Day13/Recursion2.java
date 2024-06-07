package Day13;

public class Recursion2 {
    // Generate Parentheses - no. of groups in parentheses
    public static void groupParentheses(int n, int open, int close, String ans){
        if(open == n && close == n){
            System.out.println(ans+" ");
        }
        if(open > n || close>open){
            return;
    }
        groupParentheses(n, open+1, close, ans+"(");
        groupParentheses(n, open, close+1, ans+")");
}

    public static void main(String[] args) {
        int n = 3;
        groupParentheses(n, 0, 0, "");
    }
}
