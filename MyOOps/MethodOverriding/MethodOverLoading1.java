/*
 * In concept Inheritence
 * Method overriding-
 * return type change is Possiable 
 * Any Parent class method return type is Object
 * and Child class Method return type is Derive class of
 * Object class then posiable 
 * 
 * other wise return type change is not posiable
 * 
 * - final , static , private method are cannot be overriden
 */

public class MethodOverLoading1 {
    public static void main(String[] args) {

        // A a = new A();
        B b = new B();

        // System.out.println(a.show());
        System.out.println(b.show());

    }
}

class A {
    // abstract void display();
    Object show() {
        System.out.println("Return type is Object in Class A | " + 1);
        return "Suvendu";
    }
}

class B extends A {
    @Override
    public Number show() {
        System.out.println("Return type is Number in Class B | " + 2);
        System.out.println(super.show());
        return 2;
    }

}
