import java.util.LinkedList;
import java.util.Scanner;

public class AmstrongNumber {

    public static final void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if (Amstrongnumber.isAmstrong(n)) {
            System.out.println(n + " is a Amstrong number");

        } else {
            System.out.println(n + " is not a Amstrong number");
        }

        System.out.println("0 - " + n + " All amstrong number are : " + Amstrongnumber.rangeAmstrong(n));

        System.out.print("Enter number (start) : ");
        int start = sc.nextInt();
        System.out.print("Enter number (end) : ");
        int end = sc.nextInt();

        System.out.println(
                start + " - " + end + " All amstrong number are : " + Amstrongnumber.rangeAmstrong(start, end));

    }
}

final class Amstrongnumber {
    public static boolean isAmstrong(int n) {
        int temp = n;
        int temp2 = n;
        int sum = 0;
        int l = 0;

        while (n != 0) {
            n = n / 10;
            l++;
        }

        while (temp2 != 0) {
            int re = temp2 % 10;
            temp2 = temp2 / 10;
            sum = sum + (int) (Math.pow(re, l));
        }

        if (temp != sum) {
            return false;
        }
        return true;

    }

    public static LinkedList<Integer> rangeAmstrong(int n) {
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 0; i <= n; i++) {
            if (isAmstrong(i)) {
                l.add(i);
            }
        }

        return l;

    }

    public static LinkedList<Integer> rangeAmstrong(int start, int end) {
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = start; i <= end; i++) {
            if (isAmstrong(i)) {
                l.add(i);
            }
        }

        return l;

    }

}
