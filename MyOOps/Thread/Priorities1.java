public class Priorities1 extends Thread {
    @Override
    public void run() {
        System.out.println("Child Thread : " + Thread.currentThread().getPriority());

    }

    public static void main(String[] args) {
        Thread.currentThread().setPriority(10);
        System.out.println("Main Thread : " + Thread.currentThread().getPriority());

        Priorities1 t = new Priorities1();
        // t.setPriority(10);
        t.start();
    }
}
