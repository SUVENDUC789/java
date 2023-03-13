import java.util.*;
// import java.util.ArrayList;

class Test {
    public static void main(String[] args) {

        Collection<Employee> e = new ArrayList<>();

        e.add(new Employee(1, "Ajay", 1200.50));
        e.add(new Employee(2, "Bijay", 1235.00));
        e.add(new Employee(3, "Sujay", 1135.80));

        System.out.println("Id\tName\tSalary");
        // Show all data
        for (Employee o : e) {
            System.out.println(o.getId() + "\t" + o.getName() + "\t" + o.getSalary());
        }
    }
}