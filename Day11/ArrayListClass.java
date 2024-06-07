package Day11;

import java.util.*;

public class ArrayListClass {
    /*
     * **Array List is a resizable array which stores data dynamically in java.
     * * Syntax:- ArrayList<Integer> arr = new ArrayList<>();
     */

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); // creating an array list

        // add an element into the array
        // arr.add(10);
        // arr.add(20);
        // arr.add(30);
        // arr.add(50);
        // arr.add(60);

        // if we want to add an element at correct position then we have to give their
        // index number with an element
        // arr.add(3,40);

        // Access an element
        // System.out.println(arr.get(2));

        // Remove an element
        // System.out.println(arr.remove(1));

        // Update an element
        // arr.set(2,70);

        // Update an element by replacing the existing value by adding some value to
        // that element
        // arr.set(2, arr.get(2)+10);

        // Size
        // System.out.println(arr.size());

        // Sort
        // Collections.sort(arr);

        // Display our ArrayList
        // System.out.print(arr);

        /*
         * 1.Take the size of the arrayList as an input: n
         * 2.Take the elements as an input.
         * 3.Sort the arrayList
         * 4.Sum of the arrayList
         * 5.Smallest/Largest number in your arrayList
         * 6.Average of the whole arrayList
         * 7.Make another arrayList of type String
         * 8.Take a sentence as an input, and store the words in your new arrayList
         * 9.Print the index of words that are a pallindrome
         * 10.Print the String in a reverse order via arrayList
         */

        // * 1.Take the size of the arrayList as an input: n

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arrayList: ");
        int n = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>(n);

        // * 2.Take the elements as an input in arrayList?
        System.out.println("Enter the element in arrayList: ");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            arrayList.add(element);
        }

        System.out.println(arrayList);

        // * 3.Sort the arrayList
        Collections.sort(arrayList);

        // * 4.Sum of the arrayList
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arrayList.get(i);
        }
        System.out.println("Sum of the arrayList: " + sum);

        // * 5.Smallest/Largest number in your arrayList
        int min = arrayList.get(0);
        int max = arrayList.get(0);
        for (int i = 0; i < n; i++) {
            if (arrayList.get(i) < min) {
                min = arrayList.get(i);
            }
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
        }
        System.out.println("Smallest number in arrayList: " + min);
        System.out.println("Largest number in arrayList: " + max);


        // * 6.Average of the whole arrayList
        System.out.println((double)sum/n);


        // * 7.Make another arrayList of type String
        ArrayList<String> s = new ArrayList<>();


        //  * 8.Take a sentence as an input, and store the words in your new arrayList
        String str = sc.nextLine();
        String[] arr1 = str.split(str);
        s = new ArrayList<String>(Arrays.asList(arr1));
        
        
        // * 10.Print the String in a reverse order via arrayList
        Collections.reverse(s);
        String ans = String.join(" ",s).trim();
        System.out.println(ans);


    }
}
