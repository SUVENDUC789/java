package Diff_bet_list_set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList {
    public static void main(String[] args) {
        List<Object> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);

        System.out.println(l);

        System.out.println("Using Iterrator Interface");
        Iterator<Object> iter = l.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("Using ListIterator interface (print forword direction)");
        ListIterator<Object> lit = l.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }

        
        System.out.println("Using ListIterator interface (print backword direction)");
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
    }
}
