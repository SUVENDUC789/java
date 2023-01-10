public class Test {

    public static void main(String[] args) {
        Suvendu suv = new Suvendu();
        Bristi baby = new Bristi();

        suv.start();
        /*
         * you do not call dead Thread
         */
        // suv.start();//Exception Runtime Exception
        baby.start();

    }
}

class Suvendu extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " I am Suvendu");
        }
    }
}

class Bristi extends Thread {
    @Override
    public void start() {
        System.out.println("Hi i am Bristi");

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " I am Bristi");
        }
    }

}
