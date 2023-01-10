/*
 * - 4. Performing Multiple task form Multiple thread.
 */

public class Test3 {

    public static void main(String[] args) {

        // System.out.println(Thread.currentThread().getName());

        MyThread3 t1 = new MyThread3();
        t1.start();

        MyThread2 t2 = new MyThread2();
        t2.start();

        MyThread1 t3 = new MyThread1();
        t3.start();

    }
}

class MyThread3 extends Thread {

    @Override
    public void run() {
        System.out.println("(MyThread3) Fibbonacci 42 th term is : " + fib(42));

    }

    public static long fib(long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i < 42; i++) {
            sum += i;
        }

        System.out.println("(MyThread2) Sum 42 th term is : " + sum);
    }

}

class MyThread1 extends Thread {

    @Override
    public void run() {

        int n = 42;
        int sum = (n * (n + 1)) / 2;
        System.out.println("(MyThread1) Sum 42 th term using AP : " + sum);

    }

}
