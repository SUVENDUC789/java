import java.util.*;

public class Prime {

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static LinkedList<Integer> rangePrime(int start, int end) {
        LinkedList<Integer> l = new LinkedList<>();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                l.add(i);
            }
        }
        return l;
    }

    public static void main(String[] args) {

        System.out.println(rangePrime(1,100));

    }
}
