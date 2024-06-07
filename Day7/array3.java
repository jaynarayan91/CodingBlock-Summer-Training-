package Day7;

public class array3 {

    /*
     * * Window Size Problem
     */
    // public static int findConsecutiveSum(int[] arr, int start, int end){
    //     int sum = 0;
    //     for(int i=start; i<=end; i++){
    //         sum += arr[i]; 
    //     }
    //     return sum;
    // }

    // public static void shiftByOne(int[] arr){
    //     int temp = arr[arr.length-1];
    //     for(int i=arr.length-1; i>0; i--){
    //         arr[i] = arr[i-1];
    //     }
    //     arr[0] = temp;
    //     printArr(arr);
    // }

    // public static void shiftByD(int[] arr, int d){
    //     int[] temp = new int[d];
    //     for(int i=0; i<d; i++){
    //         temp[i] = arr[i+(arr.length-d)];
    //     }
    //     for(int i=arr.length-1; i>=d; i--){
    //         arr[i] = arr[i-d];
    //     }
    //     for(int i=0; i<d; i++){
    //         arr[i] = temp[i];
    //     }

    //     printArr(arr);

    // }

    // public static void printArr(int[] arr){
    //     for(int i:arr){
    //         System.out.print(i + " ");
    //     }
    //     System.out.println();
    // }

    public static void main(String[] args) {

         //Window size = 3; j-i+1 = 3
        //  int [] arr ={1,8,3,2,6,4,7,1,4,5};

        //  int i= 0;
        //  int j = 2;
        //  int sum = 0;

        //  while(j<arr.length){
        //     int tempSum = findConsecutiveSum(arr,i,j);
        //     sum = Math.max(tempSum, sum);
        //     i++;
        //     j++;
        //  }
        //  System.out.println("Our Max Sum is: " + sum);

        // shiftByOne
        // int [] arr ={1,8,3,2,6,4,7,1,4,5};

        // shiftByOne(arr);

        //shiftByD {Condition: D<n}

        //  int [] arr ={1,8,3,2,6,4,7,9,4,5};
        //  shiftByD(arr, 2);



    }


    
}
