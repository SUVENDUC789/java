package Diff_bet_list_set;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class MySet {
    public static void main(String[] args) {
        Set<Object> s = new HashSet<>();// Store Unique Data
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        System.out.println(s);

        System.out.println("Using Iterator Interface print forword direction :");
        Iterator<Object> iter = s.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
