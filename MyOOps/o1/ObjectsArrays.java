// class Students {
//     public int roll;
//     public String name;
//     public double marks;

//     public Students(int roll, String name, double marks) {
//         this.roll = roll;
//         this.name = name;
//         this.marks = marks;
//     }
// }

// public class ObjectsArrays {
//     public static void main(String[] args) {

//         Students s[] = new Students[3];

//         s[0] = new Students(412, "Suvendu", 7.1);
//         s[0 + 1] = new Students(440, "Debarpan", 7.3);
//         s[2] = new Students(420, "Hritik", 6.9);

//         for (Students stu : s) {
//             System.out.println(stu.roll + "\t" + stu.name + "\t" + stu.marks);
//         }
//     }
// }

import java.util.Scanner;

class Students {
    public int roll = 412;
    public String name = "Suvendu";
    public double marks = 7.1;

    public Students() {
    }

    public Students(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}

public class ObjectsArrays {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // System.out.print("Enter the number of students: ");
            int n = 3;
            // int n = sc.nextInt();

            Students s[] = new Students[n];

            for (int i = 0; i < n; i++) {
                // System.out.print("Enter roll number of student " + (i + 1) + ": ");
                // int roll = sc.nextInt();
                // sc.nextLine(); // to consume the newline character after reading an integer
                // System.out.print("Enter name of student " + (i + 1) + ": ");
                // String name = sc.nextLine();
                // System.out.print("Enter marks of student " + (i + 1) + ": ");
                // double marks = sc.nextDouble();

                s[i] = new Students();
                // s[i] = new Students(roll, name, marks);
            }

            System.out.println("\nStudent Details: ");
            for (Students stu : s) {
                System.out.println(stu.roll + "\t" + stu.name + "\t" + stu.marks);
            }

            // System.out.println(s.getClass().getTypeName());
        }
    }
}
