/*
 * Output totally depends on the thread sceduler
 */

public class Yield extends Thread {
    @Override
    public void run() {
        Thread.yield();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            System.out.println(Thread.currentThread().getName() + " is Now stop");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Yield y = new Yield();
        y.setName("Suvendu");
        y.start();

        // Yield y1 = new Yield();
        // y1.setName("Supratim");
        // y1.start();

        // Thread.yield();

        for (int i = 0; i < 5; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
            Thread.sleep(1000);
            // Thread.yield();
        }
        System.out.println(Thread.currentThread().getName() + " is Now stop");

    }
}
