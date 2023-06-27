import java.util.Scanner;

public class HandShek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int handshek = (n * (n - 1)) / 2;

        int gift = n * (n - 1);

        System.out.println(n + " people handshek each other : " + handshek + " times");
        System.out.println(n + " people has gift each other : " + gift + " gift were given");

    }

}
