import java.util.*;

class Students {
    int roll;
    String name;
    double marks;

    Students(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return this.roll + " " + this.name + " " + this.marks;
    }

}

class sortbyRoll implements Comparator<Students> {

    public int compare(Students a, Students b) {
        return a.roll - b.roll;
    }

}

class sortByName implements Comparator<Students> {

    public int compare(Students a, Students b) {
        return a.name.compareTo(b.name);
    }

}

class Test {

    public static void main(String[] TeriMaki) {
        // Scanner sc = new Scanner(System.in);

        // System.out.printf("Enter number of studets : ");
        // int n = sc.nextInt();
        Students[] items = {
                new Students(420, "Hritik", 6.9),
                new Students(412, "Suvendu", 7.1),
                new Students(440, "Debarpan", 7.3),
                new Students(466, "Srijit", 8.5),
                new Students(403, "Debojit", 8.8),
        };

        // for (int i = 0; i < n; i++) {
        // System.out.printf("Enter roll number [%d] :", (i + 1));
        // int roll = sc.nextInt();
        // sc.nextLine();
        // System.out.printf("Enter Name [%d] :", (i + 1));
        // String name = sc.nextLine();
        // System.out.printf("Enter Marks [%d] :", (i + 1));
        // double marks = sc.nextDouble();

        // items[i] = new Students(roll, name, marks);
        // }

        System.out.println("Roll Name Marks");

        for (int i = 0; i < items.length; i++)
            System.out.println((i + 1) + ")" + items[i]);

        Arrays.sort(items, new sortbyRoll());

        System.out.println("Roll Name Marks (After sort roll)");
        for (int i = 0; i < items.length; i++)
            System.out.println((i + 1) + ")" + items[i]);

        Arrays.sort(items, new sortByName());

        System.out.println("Roll Name Marks (After sort Name)");
        for (int i = 0; i < items.length; i++)
            System.out.println((i + 1) + ")" + items[i]);
    }

}