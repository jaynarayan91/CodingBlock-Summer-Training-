package Day9;

// import java.util.*;

public class BinarySearch {

    public static int search(int[] arr, int target){
    int i=0;
    int j=arr.length-1;

    while (i<=j) {
    int mid = (i+j)/2;
    if (arr[mid] == target) {
    return mid;
    }else{
    if (arr[mid] < target) {
    i = mid+1;
    }else{
    j = mid-1;
    }
    }
    }
    return -1;
    }

    // * * LowerBound

    // public static int lowerBound(int[] arr, int target){
    // int i=0;
    // int j=arr.length-1;
    // int ans = arr.length;
    // while (i<=j) {
    // int mid = (i+j)/2;
    // if (arr[mid] <= target) {
    // ans = mid;
    // i = mid+1;
    // }else{
    // j = mid-1;
    // }
    // }
    // return ans;
    // }

    // * * UpperBound
    // public static int upperBound(int[] arr, int target) {
    //     int i = 0;
    //     int j = arr.length - 1;
    //     int ans = arr.length;
    //     while (i <= j) {
    //         int mid = (i + j) / 2;
    //         if (arr[mid] > target) {
    //             ans = mid;
    //             j = mid - 1;
    //         } else {
    //             i = mid + 1;
    //         }
    //     }
    //     return ans;
    // }

    // public static void printArr(int[] arr){
    // for (int i=0; i<arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // }

    // public static void main(String[] args) {
    // int[] arr = {1,6,3,7,8,9,2,0};
    // Arrays.sort(arr);
    // printArr(arr);

    // System.out.println(search(arr, 9));
    // }

}
