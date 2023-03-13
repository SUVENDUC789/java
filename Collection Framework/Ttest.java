import java.util.ArrayList;
import java.util.Collection;

class Test {
    public static void main(String[] args) {

        Collection ob = new ArrayList();

        ob.add(10);
        ob.add(20);
        ob.add(30);
        ob.add("Suvendu");
        ob.add("Supratim");
        ob.add('A');
        ob.add(7.1);
        ob.add(7.3);

        for (Object i : ob) {
            System.out.println(i);
        }

        System.out.println(ob);

    }
}