import java.util.Stack;

public class NGE {
    // next greater element towards right side
    static int [] rightNGE(int arr[]){
        int [] right = new int[arr.length];
        Stack<Integer> stk = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            while (!stk.isEmpty() && stk.peek() < arr[i]) {
                stk.pop();
            }
            if(stk.isEmpty()){
                right[i] = -1;
            }else{
                right[i] = stk.peek();
            }
            stk.push(arr[i]);
        }
        return right;
    }


    // next greater element towards left side

    public static int [] leftNGE(int arr[]){
        int [] left = new int[arr.length];
        Stack<Integer> stk = new Stack<>();

        for(int i=0; i<arr.length; i++){
            while (!stk.isEmpty() && stk.peek() < arr[i]) {
                stk.pop();
            }
            if(stk.isEmpty()){
                left[i] = -1;
            }else{
                left[i] = stk.peek();
            }
            stk.push(arr[i]);
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {8,2,7,3,4,6,9};
        int[] right = rightNGE(arr);
        for(int i:right){
            System.out.print(i+ " ");
        }
        System.out.println();

        int[] left = leftNGE(arr);
        for(int i:left){
            System.out.print(i+ " ");
        }
    }
}


