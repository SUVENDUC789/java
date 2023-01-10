import java.util.Scanner;

final public class Palindrom {

    final public boolean isPalindrom(String s) {

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }

        }
        return true;
    }

}

class Test {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter string : ");
            String s = sc.nextLine();

            Palindrom o = new Palindrom();
            System.out.println(o.isPalindrom(s));
        }

    }
}