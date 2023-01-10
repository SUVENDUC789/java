class A {
    int display(int roll) {

        System.out.println("Name : Suvendu Chowdhury Roll : S-" + roll);
        return 20;
    }

    protected void show(int i) {
        System.out.println("Hello a :" + i);
    }

}

class B extends A {
    @Override
    public void show(int i) {
        System.out.println("Hello b :" + i);
        System.out.println("Age : " + super.display(412));
        ;
    }
}

public class Test2 {
    public static void main(String[] args) {

        B b = new B();
        b.show(10);

    }
}
