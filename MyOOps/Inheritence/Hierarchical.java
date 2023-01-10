class A {
    void showA() {
        System.out.println("in A class showA().");
    }
}

class B extends A {
    void showB() {
        System.out.println("in B class showB().");
    }
}

class C extends A {
    void showC() {
        System.out.println("in C class showC().");
    }
}

class Test {
    public static void main(String[] args) {

        B b = new B();
        b.showA();
        b.showB();

        C c = new C();
        c.showA();
        c.showC();

    }
}