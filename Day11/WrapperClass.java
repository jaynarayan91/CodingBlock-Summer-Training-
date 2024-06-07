package Day11;

public class WrapperClass {
    
    /* **It is a type of class which is defined as the datatype present in the class is same 
    as itself of Full name of that datatype which is starting from capital letter.*/

    /* **Ex:-
         
         Datatype :- int/boolean/byte/char/float/short/long/double  ---->>>   
         WrapperClass:- Integer/Boolean/Byte/Float/Short/Long/Double
    */

    public static void main(String[] args) {
        
        Integer i = 128;
        // int k = 10;
        Integer k = i;
        // Integer k1 = 11;

        System.out.println(i==k);

    }
}
