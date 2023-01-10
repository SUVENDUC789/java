public class Test2 {
    public static void main(String[] args) {
        MyOwnThread m = new MyOwnThread();
        MyOwnThread2 m2 = new MyOwnThread2();

        Thread th = new Thread(m);
        Thread th2 = new Thread(m2);

        th.start();
        th2.start();
    }

}

class MyOwnThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "  S-412 Suvendu");
        }
    }

    public void run(int magi) {
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "  S-412 Suvendu (Parameter)");
        }
    }
}

class MyOwnThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "  S-420 Hritik");
        }
    }
}
