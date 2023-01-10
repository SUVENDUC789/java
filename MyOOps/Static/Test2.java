import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of employee : ");
            int n = sc.nextInt();
            Employee e[] = new Employee[n];

            for (int i = 0; i < n; i++) {
                System.out.printf("Enter eid  [%d]: ", (i + 1));
                int id = sc.nextInt();
                sc.nextLine();// this is for new line character
                System.out.printf("Enter name [%d] : ", (i + 1));
                String name = sc.nextLine();

                e[i] = new Employee(id, name);

            }

            System.out.println("Display Employee details :>");
            for (int i = 0; i < n; i++) {
                System.out.println(e[i].getEid() + " " + e[i].getName() + " " + e[i].getCompany());
            }
        }

    }
}

class Employee {
    // another instace variable are occupy heap memory
    private int eid;

    public int getEid() {
        return eid;
    }

    private String name;

    public String getName() {
        return name;
    }

    // connect heap to stack
    public Employee(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }

    // Ststic variable are occupy class or method memory
    private static String company = "Chowdhury Industry";

    public String getCompany() {
        return company;
    }

}
