package Day10;

/**
 * Strings
 */
public class Strings {
    public static void main(String[] args) {
        // String s0 = "Hellow";
        // String s1 = "Hello World!"; // String literal
        // String s2 = new String(s0); // String object
        // String s3 = new String("Hello World!"); // String object
        // System.out.println(s0);
        // System.out.println(s0==s3);
        // String s4 = s0+s1;
        // System.out.println(s4);

        String s = "Hello";
        String t = new String("Hello");
        System.out.println(comp(s, t));
        
    }

    //**Comparison by true or false !!

    // public static boolean comp(String s1, String s2){
    //     if(s1.length() != s2.length()) return false;

    //     for(int i=0; i<s1.length(); i++){
    //         if(s1.charAt(i) != s2.charAt(i)) return false;
    //     }
    //     return true;
    // }

    //**Comparison by Value - which means it gives value!!

    public static int comp(String s1, String s2){
        if(s1 == s2) return 0;
        int length = Math.min(s1.length(), s2.length());
        for(int i=0; i<length; i++){
            if(s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
                }
    }
    return s1.length()-s2.length();
 }
}