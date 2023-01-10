/*
 * - 2. Performing single task form Multiple thread.
 */

public class Test2 extends Thread {
    private static int v;
    // 4 thread created
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println((v + 1) + ") I am suvendu (I am Iron man)");
            v++;
        }
    }
    public static void main(String[] args) {
        Test2 t = new Test2();// thread 1
        t.start();

        Test2 t2 = new Test2();// thread 2
        t2.start();

        Test2 t3 = new Test2();// thread 3
        t3.start();

    }

}
