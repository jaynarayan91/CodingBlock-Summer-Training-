package Day6;

public class array2 {

    // public static void findLast(int[] roll, int key){
    //     int index = -1;
    //     for(int i = 0; i < roll.length; i++){
    //         if(roll[i] == key){
    //             index = i;
    //             }
    //     }
    //     System.out.println(index);
    //     return;
    // }

//     public static void printKey(int[] roll, int key){
//         for(int i = 0; i < roll.length; i++){
//             if(roll[i] == key){
//                 System.out.println("The key is at index " + i);
//     }
// }
//         return;
//     }

public static void swapIndices(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
    public static void main(String[] args) {

         int[] arr = {2,3,6,2,8,9,3};
        //  printKey(arr, 3);
        //  findLast(arr,3);
        swapIndices(arr, 3, 4);
    }
    
}
