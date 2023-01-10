public class Test4 extends Thread {
    @Override
    public void run() {
        // System.out.println("I am in Test4 class");
        /*
         * Thread-0 thread created by JVM
         */
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
    }

    public static void main(String[] args) {
        /*
         * Main thread created by JVM
         */

        Test4 t = new Test4();
        t.setName("MMCC");
        t.start();

        // System.out.println("Hello Main Thread");

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(t.isAlive());
        // Thread.currentThread().setName("Suvendu");
        // System.out.println(Thread.currentThread().getName());

        // System.out.println(10 / 0);
    }
}
