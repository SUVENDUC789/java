public class StringReverse {
    public static void main(String[] args) {
        String a = "", b = "";

        System.out.println("Enter sentence : ");
        a = new java.util.Scanner(System.in).next();

        for (int i = a.length() - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }

        System.out.println(a + " reverse is : " + b);

    }
}
