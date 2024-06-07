package Day11;

import java.util.*;

public class String2 {

    // *Palindrome Function */
    // public static boolean isPalindrome(String str) {
    //     int i = 0;
    //     int j = str.length() - 1;
    //     while (i < j) {
    //         if (str.charAt(i) != str.charAt(j)) {
    //             return false;
    //         }
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }

    //*Find the name of substring from given string */
    // public static String findName(String str) {
    //     String name = "arrays";
    //     for(int i = 0; i<=str.length()-1; i++){
    //         for(int j=i+1; j<=str.length();j++){
    //             if(str.substring(i,j).equals(name)){
    //                 return str.substring(i,j);
    //                 }
    //                 }
    //         }
    //         return str;
    //     }
        

    //* Reverse of string */
    public static String reverse(String str) {
        str.trim();
        String[] arr = str.split("\s+");
        String revStr = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            revStr += arr[i]+" ";
            }
            return revStr.trim();
        }

    // *Find the number of good substrings */
    // public static int goodSubstrings(String str) {
    //     int count = 0;
    //     for (int i = 0; i < str.length(); i++) {
    //         for (int j = i + 1; j < str.length(); j++) {
    //             if (isPalindrome(str.substring(i, j))) {
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    public static void main(String[] args) {
        // String str = "ababbbabbababa";
        // System.out.println(goodSubstrings(str));
        String s1 = "Is Sky Of Colour Blue";
        
        System.out.print(reverse(s1));
    }

}
