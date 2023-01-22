import java.util.*;

class Perfectnumber {
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static LinkedList<Integer> rangePerfect(int n) {
        LinkedList<Integer> l = new LinkedList<>();

        for (int i = 0; i <= n; i++) {
            if (isPerfect(i)) {
                l.add(i);
            }
        }
        return l;
    }

    public static LinkedList<Integer> rangePerfect(int start, int end) {
        LinkedList<Integer> l = new LinkedList<>();

        for (int i = start; i <= end; i++) {
            if (isPerfect(i)) {
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

        if (Perfectnumber.isPerfect(n)) {
            System.out.println(n + " is Perfect number");
        } else {
            System.out.println(n + " is not Perfect number");
        }

        System.out.println("0 - " + n + " all perfect number are : " + Perfectnumber.rangePerfect(n));

        int start, end;
        System.out.print("Enter number (start) : ");
        start = sc.nextInt();
        System.out.print("Enter number (end) : ");
        end = sc.nextInt();

        System.out.println(start + " - " + end + " all perfect number are : " + Perfectnumber.rangePerfect(start, end));
    }
}