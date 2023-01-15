/*
 * after completly excecute Suv Thread then Execute Main Thread
 */

public class Join extends Thread {
    static Thread mainThread;

    @Override
    public void run() {
        try {
            mainThread.join();
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println(Thread.currentThread().getName() + " now stop");
        }
    }

    public static void main(String[] args) throws Exception {

        mainThread = Thread.currentThread();

        Join j = new Join();
        j.setName("Suv");
        j.start();

        // j.join();

        // j.run();// It is also main Thread

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println(Thread.currentThread().getName() + " now stop");
        }

    }
}
