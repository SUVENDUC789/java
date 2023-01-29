import java.util.*;

public class Fibbonacci {

    public static int findFib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        return findFib(n - 1) + findFib(n - 2);
    }

    public static LinkedList<Integer> rangeFib(int end) {
        LinkedList<Integer> l = new LinkedList<>();

        for (int i = 1; i <= end; i++) {
            l.add(findFib(i));
        }
        return l;
    }

    public static void main(String[] args) {

        System.out.println("Enter number : ");
        int n = new Scanner(System.in).nextInt();

        System.out.println(rangeFib(n));

    }
}
