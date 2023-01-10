/*
 * - 1. Performing single task form single thread.
 */

public class Test1 extends Thread {
    // But create two thread internally
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ") I am suvendu");
        }
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.start();

    }

}
