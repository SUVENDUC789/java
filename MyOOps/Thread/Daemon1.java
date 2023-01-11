public class Daemon1 extends Thread {
    public void run() {

        if (Thread.currentThread().isDaemon())
            System.out.println("It is daemon thread");
        else
            System.out.println("It is child thread");

        // for (int i = 0; i < 5; i++) {
        // System.out.println(" Hi i am suvendu");
        // }

    }

    public static void main(String[] args) {
        System.out.println("This is the simple example of daemon Thread");

        Daemon1 d = new Daemon1();// create thread
        d.setDaemon(true);// thread as a Daemon thread
        d.start();// start thread
        // d.setDaemon(true);// thread as a Daemon thread

    }

}
