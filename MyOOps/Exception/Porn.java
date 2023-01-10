import java.util.Scanner;

// Runtime exception i mean uncheked exception 
class PornException extends RuntimeException {
    PornException(String msg) {
        super(msg);
    }
}

public class Porn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age : ");
        int age = sc.nextInt();

        try {
            if (age >= 18 + 2) {
                System.out.println("You have to see Porn");
            } else {
                throw new PornException("You do not see porn (But suvendu all time see porn)");
                // System.out.println("Jvm do not reach");//-->do not wright any statement
            }
        } catch (PornException e1) {
            e1.printStackTrace();
        }
        System.out.println("Normal termination .");
    }

}
