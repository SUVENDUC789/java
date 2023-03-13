/*
 * Collection interface in java
 * -----------------------------
 *      public boolean add (Object obj);
 *      public boolean addAll (Collection c);
 * 
 *      public boolean remove (Object o);
 *      public boolean removeAll (Collection c);
 * 
 *      public void clear();
 *      public boolean contains (Object o);
 *      public boolean containAll (Collection c);
 * 
 *      public boolean isEmpty();
 *      public int size();
 *      Iterator iterator();
 */

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Collection<Object> l = new ArrayList<>();

        l.add(100);
        l.add(200);
        l.add(300);

        System.out.println(l.size());
        l.remove(100);// --->Object 100 value deleted
        System.out.println(l);
        l.clear();

        if (l.isEmpty()) {
            System.out.println("l object is now empty...");
        }

        Collection<Object> l1 = new ArrayList<>();

        l1.add("aaa");
        l1.add("bbb");
        l1.add("ccc");

        if (l1.contains("aa")) {
            System.out.println("aaa is present in l1 Object");
        }

        if (l1.containsAll(l)) {
            System.out.println("l all element present in l1");
        }

        System.out.println(l1);

        l.addAll(l1);
        System.out.println(l);
        l.removeAll(l);
        System.out.println(l);

    }
}
