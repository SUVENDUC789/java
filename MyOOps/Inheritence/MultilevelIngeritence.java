/* Multilevel Inheritence */
// Object is the one of the parent class of the java 

class A extends Object {
    // private void greet() {
    // System.out.println("Hello bro I am private ");
    // }

    void showA() {
        System.out.println("I am in A class");
    }
}

class B extends A {
    void showB() {
        System.out.println("I am in B class");
    }
}

class C extends B {
    public static void main(String[] args) {

        C c = new C();
        c.showA();
        c.showB();
        // c.greet();//You do not access Private Property

    }
}