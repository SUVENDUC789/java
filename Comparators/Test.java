import java.util.Arrays;
import java.util.Comparator;

public class Test {

    public static void main(String[] args) {
        Student[] arr = new Student[5];

        arr[0] = new Student(412, "Suvendu");
        arr[1] = new Student(420, "Hrittik");
        arr[2] = new Student(440, "Debarpan");
        arr[3] = new Student(411, "Supratim");
        arr[4] = new Student(408, "None");

        Arrays.sort(arr, new CustomeComparetor());

        Student.display(arr);

    }
}

class CustomeComparetor implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
        return o1.roll - o2.roll;
    }

}

class Student {
    public int roll;
    public String name;

    public Student(int r, String s) {
        this.roll = r;
        this.name = s;
    }

    public static void display(Student[] arr) {
        System.out.println("Roll\tName");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].roll + "\t" + arr[i].name);
        }
    }

}
