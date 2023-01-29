public class TestThread {
    public static void main(String[] args) {
        MyT t1 = new MyT("Suvendu");
        MyT t2 = new MyT("Supratim");

        Thread t11 = new Thread(t1);
        Thread t12 = new Thread(t2);

        t11.start();
        t12.start();
    }

}
class MyT implements Runnable {
    String name;

    MyT(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name);
    }
}

