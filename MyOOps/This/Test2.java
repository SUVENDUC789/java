class A {
    A() {
        this(216);
        System.out.println("No arg constructor");
    }

    A(int i) {
        // this();
        System.out.println("Parameterize constructor : " + i);
    }
}

public class Test2 {
    public static void main(String[] args) {

        // A a = new A();
        A a1 = new A();

    }
}
