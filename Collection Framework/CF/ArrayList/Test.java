package ArrayList;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Object> al1 = new ArrayList<>();

        al1.add(10);
        al1.add(20);
        al1.add("Suvendu");
        al1.add(30);
        al1.add(108);
        al1.add("Chowdhury");
        al1.add('A');

        ArrayList<Object> al2 = new ArrayList<>();

        al2.add(108);
        al2.add("Suvendu");
        al2.add("Chowdhury");
        al2.add('A');

        // al1.addAll(al2);

        al1.removeAll(al2);// Remove all elemenet

        // al1.remove("Suvendu");// Remove Object
        // al1.remove(2);// Remove Index
        // al1.remove(10); //-> Throw error

        // al1.clear();

        System.out.println(al1.contains("al2"));
        System.out.println(al1.contains(10));

        System.out.println(al1);
        al1.set(2, 2002);
        System.out.println(al1);
    }
}
