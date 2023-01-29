import java.util.*;

public class Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Phone Number : ");
        Long number = sc.nextLong();

        System.out.print("Enter Gender : ");
        Character g = sc.next().charAt(0);

        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Number : "+number);
        System.out.println("Gender : "+g);
    }
}
