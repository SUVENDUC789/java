package Enumeration;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>();

        v.add(10);
        v.add("Suvendu");
        v.add(10.25f);
        v.add(10.252365);
        v.add('A');

        System.out.println(v);

        Enumeration<Object> e = v.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

    }
}
