import java.util.Scanner;

/*
 * I will create unchecked exception
 * means runtime exception
 */
class MyException extends RuntimeException {

    MyException(String msg) {
        super(msg);
    }

}

public class Own {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("You have to see porn | beacuse your age is 18+");
        } else {
            throw new MyException("You don't to see porn | beacuse your age not 18+");

        }

    }

}
