/*
 * you cannot define static variable in any inner class method
*/

class A {
    int i;

    // void show(int k)
    // {
    // static int j=10;
    // return i+j+k;
    // }

}

public class Test {
    public static void main(String[] args) {
        A a = new A();
        // System.out.println(a.show(10));

    }
}