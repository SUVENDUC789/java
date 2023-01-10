public class Test3 {
    public static void main(String[] args) {
        B b = new B();

    }
}

class A {
    A() {
        System.out.println("I am in A class Constructor");
    }
}

class B extends A {
    B() {
        super();//-->Compiler imlicitly inject 
        System.out.println("I am in B class Constructor");
    }

}
