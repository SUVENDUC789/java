class A {
    private int i;// --> Instace Variable

    public void setI(int i) {
        /*
         * This is the reference variable
         * this keyword refer to the object
         */
        this.i = i;// -->using this keyword
    }

    public int getI() {
        return i;
    }
}

public class Test extends A {
    public static void main(String[] args) {

        Test t = new Test();
        t.setI(100);
        System.out.println("Result : " + t.getI());

    }
}