public class SleepMethod1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SleepMethod1 t = new SleepMethod1();
        t.start();
        System.out.println("2 Second wait...");

    }
}
