class A {
    int a = 10;
}

class B extends A {
    int a = 20;

    public void show(int a) {
        System.out.println("Parameter : " + a);
        System.out.println("Parameter (Current class Instance) : " + this.a);
        System.out.println("Parameter (Parent class Instance) : " + super.a);
    }
}

public class Test {
    public static void main(String[] args) {

        B b = new B();
        b.show(216);

    }
}