import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Father Sanjay = new Son();
        Sanjay.name();// -->this is class Son class Method (Overloaded)
        Sanjay.lazy();
        // Sanjay.goodThink();-->This is throw error.

        // Son Supratim = new Father();//You do not refer parent class 

        Father Debashis = new Father();

        // Debashis.name();
        // Debashis.lazy();
        // Debashis.goodThink();

        Son Suvendu = new Son();
        // Suvendu.name();
        // Suvendu.goodThink();
        // Suvendu.lazy();

    }
}

class Father {
    void name() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your  name : ");
            String fn = sc.nextLine();
            System.out.println("Your  name is : " + fn);
        }
    }

    void lazy() {
        System.out.println("Every time Social media on...");
    }
}

class Son extends Father {

    @Override
    void name() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your  name : ");
            String fn = sc.nextLine();
            System.out.println("Your  name is : " + fn);
        }

    }

    void goodThink() {
        System.out.println("Genious Bilinear playboy Philosopist ...");
    }

}
