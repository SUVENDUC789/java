import java.util.*;

class Krishnamurthynumber {
    private static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static boolean isKrishnamurthyNumber(int n) {
        int temp = n;
        int sum = 0;
        while (n != 0) {
            int re = n % 10;
            n = n / 10;
            sum += (fact(re));
        }
        return sum == temp;
    }

    public static LinkedList<Integer> rangeKrishnamurthy(int n) {
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 0; i <= n; i++) {
            if (isKrishnamurthyNumber(i)) {
                l.add(i);
            }
        }
        return l;
    }

    public static LinkedList<Integer> rangeKrishnamurthy(int start, int end) {
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = start; i <= end; i++) {
            if (isKrishnamurthyNumber(i)) {
                l.add(i);
            }
        }
        return l;
    }
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if (Krishnamurthynumber.isKrishnamurthyNumber(n)) {
            System.out.println(n + " is Krishnamurthy number");
        } else {
            System.out.println(n + " is not Krishnamurthy number");
        }
        System.out.println(
                "0 - " + n + " all Krishnamurthy number are : " + Krishnamurthynumber.rangeKrishnamurthy(n));

        int start, end;
        System.out.print("Enter number ( start ) :");
        start = sc.nextInt();
        System.out.print("Enter number ( end ) :");
        end = sc.nextInt();

        System.out.println(
                start + " - " + end + " all Krishnamurthy number are : "
                        + Krishnamurthynumber.rangeKrishnamurthy(start, end));

    }
}