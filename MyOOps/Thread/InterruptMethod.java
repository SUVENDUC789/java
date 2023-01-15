public class InterruptMethod extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                sleep((1000 * i));

            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println(Thread.currentThread().getName() + " is now stop");
        }
    }

    public static void main(String[] args) {
        InterruptMethod t = new InterruptMethod();
        t.start();
        t.interrupt();

    }
}
