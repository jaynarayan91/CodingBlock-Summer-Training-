package Day8;

import java.util.Arrays;

public class Sorting1 {

    // **Bubble Sort

    // public static void swap(int[] arr, int i, int j) {
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // public static void bubbleSort(int[] arr) {
    //     for (int turn = 1; turn < arr.length; turn++) {
    //         for (int i = 0; i < arr.length - turn; i++) {
    //             if (arr[i] > arr[i + 1]) {
    //                 swap(arr, i, i + 1);
    //             }
    //         }
    //     }
    // }

    // **Selection Sort

    // public static int minIndexValue(int[] arr, int i){
    //     int minIndex = i;
    //     for(int j=i+1; j<arr.length; j++){
    //         if(arr[j]<arr[minIndex]){
    //             minIndex = j;
    //         }
    //     }
    //     return minIndex;
    // }

    // public static void selectionSort(int[] arr){
    //     for(int i=0; i<arr.length-1; i++){
    //         int idx = minIndexValue(arr,i);
    //         swap(arr,i,idx);
    //     }
    // }

    //**Insertion Sort */
    
    // public static void insertionSort(int[] arr){
    //     int n=arr.length;
    //     for(int i=1; i<n; i++){
    //         int key = arr[i];
    //         int j = i-1;
    //         while(j>=0 && arr[j]>key){
    //             arr[j+1] = arr[j];
    //             j--;
    //         }
    //         arr[j+1] = key;
    //     }
    // }

    //    public static int findSmallest(int[] roll){
    //             int smallest = roll[0];
    //             for(int i=0; i<roll.length; i++){
    //                 if(roll[i] < smallest){
    //                    smallest = roll[i];
    //             }
               
    //         }
    //         return smallest;
    //     }

    public static void main(String[] args) {
        // int[] arr = { 5, 4, 8, 9, 10, 3, 2, 1 };
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // Arrays.sort(arr);
        // System.out.println(findSmallest(arr));
        // printArr(arr);
        // int[] arr1 = {0,2,3,5,1,7};
        // Arrays.sort(arr1);
        // printArr(arr1);
        // System.out.println(arr1[arr1.length-2]);
       
    }
}