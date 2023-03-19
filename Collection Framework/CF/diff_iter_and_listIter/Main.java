package diff_iter_and_listIter;

// select * from emp where uname='105'-- ' and pass='debu';
// select * from emp where email='suvenduc696@gmail.com' and pass='suvenduc696@gmail.com' or 1=1 -- ';

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        List<Object> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l);

        // Iterator<Object> iter = l.iterator();
        // while(iter.hasNext()){
        // System.out.println(iter.next());
        // }

        System.out.println("ListIterator (next)");
        ListIterator<Object> li = l.listIterator();

        while (li.hasNext()) {
            System.out.println(li.next());
        }

        System.out.println("ListIterator (previous)");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }

        li.add("Suvendu");// Add using listIterator Object
        System.out.println(l);

        // System.out.println("Hello World");
    }
}
