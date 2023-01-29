public class Fact {
    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        } else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Enter number : ");
        long n = new java.util.Scanner(System.in).nextLong();
        System.out.println(n + " ! = " + factorial(n));
    }
}
