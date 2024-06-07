package Day10;

import java.util.*;
/* **This is the question for finding the minimum number of pages from maximum value of pages */

public class SearchSpace {

    public static boolean check(int[] book, int mid, int students) {
        int currStudent = 1;
        int cSum = 0;
    
        for(int i: book){
            if(cSum + i <= mid){
                cSum += i;
            }else{
                currStudent++;
                if(currStudent>students || i>mid){
                    return false;
                }else{
                    cSum = i;
                }
            }
        }
        return true;
    }
    
    public static int spaceSearch(int[] book, int student){
        int ans = -1;
        int i = 0;
        int j = Arrays.stream(book).sum();   //*this is the function to  find sum of the given array!
        while(i<=j){
            int mid = i+(j-i)/2;
            if(check(book,mid,student)){
                ans = mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
         int[] arr = {10, 20, 30, 40};
         System.err.println(spaceSearch(arr, 2));
    }

    
}
