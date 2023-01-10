// String Class Constructors in Java

/* String class syntax */
// public final class Emni extends Object implements CharSequence,Serializable,Comparable{}

public class Test3 {
    public static void main(String[] args) {
        /* Why char Array is Better to Store Password Than String
         * -> Because String Constant Pool have not any Garbage Collector
         * -> Older password are store in Scp or Slp 
         * -> Then chance for hack your passowrd
         * -> In this case you use Character Array.
         */

        // Convert Character array to string
        char[] a = { 'C', 'h', 'o', 'w', 'd', 'h', 'u', 'r', 'y' };
        String sa = new String(a);
        System.out.println(sa);

        // byte to Character convertion
        byte[] b = { 97, 101, 102, 103 };
        String s1 = new String(b);
        System.out.println(s1);

        // convert mutable Object to immutable object
        StringBuffer sb = new StringBuffer("Suvendu");
        String s = new String(sb);
        System.out.println(s);

    }
}
