package Day5;

import java.util.Scanner;

/*
 * * ARRAY:- 
 *
 -- A collection of element of the same datatype which is store in a fixed size and sequence.

 * *Syntax of new Array
 *
 --  dType[] arr = new dType[size];

 --Ex:-
        int[] arr1 = new int[5];
        int [] arr2 = {1,2,3,4,5};
        String[] str1 = new String[5];
        String[] str2 = {"Jay", "Pencil", "Paper", "Pen"};
        float[] arr3 = new float[5];
        char[] arr4 = new char[5];

 */





 public class array {
    public static void main(String[] args) {

        //CRUD

        // int[] arr1 = new int[5];
        
        // for(int i=0; i<5; i++){
        //     arr1[i] = i;
        //     System.out.println(arr1[i]);
        // }

        
        

        // int [] arr2 = {1,2,3,4,5};
        // String[] str1 = new String[5];
        // String[] str2 = {"Jay", "Pencil", "Paper", "Pen"};
        // char[] ch1 = new char[5];
        // char[] ch2 = {'a', 'b', 'c', 'd'};


        // System.out.println(arr1);
        // System.out.println(arr2);
        // System.out.println(str1);
        // System.out.println(str2);
        // System.out.println(ch1);
        // System.out.println(ch2);


        // int[] rollNumbers = {2,5,6,1,9};
        // System.out.println(searchRoll(rollNumbers, 1)); 

        // int[] rollNumbers = {10,4,7,3,9,1};
        // System.out.println(findSum(rollNumbers));
        // System.out.println(findSmallest(rollNumbers));

        // System.out.println(findLargestRange(rollNumbers, 1, 3));
        // System.out.println(findSmallestRange(rollNumbers, 0, 4));

    }


        /*
         * Array Part-2
         */

        // int [] arr = new int[7];
        // int [] arr2 = {1,2,3,4,5};

        // System.out.println(arr.length);
        // System.out.println(arr2);

    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the size of array: ");
    //     int n = sc.nextInt();

    //     int arr[] = new int[n];
    //     System.out.println("Enter the element of array: ");
    //     for(int i=0; i<arr.length; i++){
    //         // System.out.print("Enter the element in array: ");
    //         arr[i] = sc.nextInt();
    //     }
    //     System.out.print("Following array is: ");
    //     for(int i=0; i<arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }

    //     int a = arr[2];
    //     int b = arr[3];

    //     System.out.println("\nThe sum of 2 indices are: " + sum(a, b));


    // }

    // public static int sum(int a, int b){
    //     int s = a+b;
    //     return s;
    // }

//     public static int searchRoll(int[] roll, int r){
//         for(int i=0; i<roll.length; i++){
//             if(roll[i] == r){
//                 return i;
//             }
//             else continue;
//     }
//     return -1;
// }

    //     public static int findLargest(int[] roll, int r){
    //         int largest = 0;
    //         for(int i=0; i<roll.length; i++){
    //             if(roll[i] > largest){
    //                largest = roll[i];
    //         }
           
    //     }
    //     return largest;
    // }

    // public static int findSmallest(int[] roll){
    //             int smallest = roll[0];
    //             for(int i=0; i<roll.length; i++){
    //                 if(roll[i] < smallest){
    //                    smallest = roll[i];
    //             }
               
    //         }
    //         return smallest;
    //     }

    // public static int findSum(int[] roll){
    //     int sum = 0;
    //     for(int i=0; i<roll.length; i++){
    //         sum += roll[i];
    //         }
    //         return sum;
    // }

//     public static int findSumRange(int[] roll, int start, int end){
//         int sum = 0;
//         for(int i=0; i<roll.length; i++){
//             if(i >= start && i <= end){
//                 sum += roll[i];
//         }
        
//     }
//     return sum;
// }

//         public static int findLargestRange(int[] roll, int start, int end){
//             int largest = start;
//             for(int i=start; i<=end; i++){
//                 if(roll[i] > largest){
//                     largest = roll[i];
//         }
//     }
//     return largest;
// }

    //       public static int findSmallestRange(int[] roll, int start, int end){
    //         int smallest = end;
    //         for(int i=start; i<=end; i++){
    //             if(roll[i] < smallest){
    //                 smallest = roll[i];
    //       }
    //     }
    //     return smallest;
    // }

/* Homework:-
   ===>>> Code + Dry run
   1.findLargestInRange
   2.findSmallestInRange
    */    

  

    
}

