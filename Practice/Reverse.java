public class Reverse {
    public static void main(String[] args) {
        long n, rev = 0;
        System.out.println("Enter number : ");
        long num = new java.util.Scanner(System.in).nextLong();
        n = num;
        while (num != 0) {
            long re = num % 10;
            rev = (rev * 10) + re;
            num = num / 10;
        }

        System.out.println(n + " Reverse number is : " + rev);

    }
}
