public class Sleep extends Thread {
    @Override
    public void run() {
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

    public static void main(String[] args) {
        Sleep s = new Sleep();
        s.start();
        // s.run();

        Sleep s2 = new Sleep();
        s2.start();
        // s2.run();

    }

}
