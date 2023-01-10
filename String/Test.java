// package String;

final class Abc {
    /* but you can create an object and olso use all public static method */
    final public void print(String s) {
        System.out.println(s);
    }
}// ---->Final class you don not extend it

public class Test {
    public static void main(String[] args) {
        final String s = "Suvendu";// 1 object
        // String s = "Suvendu";// 1 object
        // String s = new String("Suvendu");// 2 object
        // s = s.concat(" Chowdhury");// 1 object create in scp
        // System.out.println(s);

        Abc o = new Abc();
        o.print(s.concat(" Chowdhury"));
    }
}
