import java.util.*;

class Primenumber {
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static LinkedList<Integer> rangePrime(int n) {
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                l.add(i);
            }
        }
        return l;
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

}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        if (Primenumber.isPrime(n)) {
            System.out.println(n + " is a Prime Number");

        } else {
            System.out.println(n + " is not a Prime number");
        }

        System.out.println("0 - " + n + " Primes number are : " + Primenumber.rangePrime(n));

        System.out.print("Enter number (start) : ");
        int start = sc.nextInt();
        System.out.print("Enter number (end) : ");
        int end = sc.nextInt();

        System.out.println(start + " - " + end + " Primes number are : " + Primenumber.rangePrime(start, end));

    }
}