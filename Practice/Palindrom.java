import java.util.*;

public class Palindrom {

    public static boolean isPalindrom(int n) {
        int num = n;
        int rev = 0;

        while (n != 0) {
            int re = n % 10;
            rev = (rev * 10) + re;
            n = n / 10;
        }

        return num == rev;
    }

    public static LinkedList<Integer> rangePal(int start, int end) {
        LinkedList<Integer> l = new LinkedList<>();

        for (int i = start; i <= end; i++) {
            if (isPalindrom(i)) {
                l.add(i);
            }
        }

        return l;
    }

    public static void main(String[] args) {

        System.out.println(rangePal(1,1000));

    }
}