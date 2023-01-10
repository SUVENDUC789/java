import java.lang.*;

public class Test {
    public static void main(String[] args) {
        Integer i = Integer.valueOf("111",16);
        Long l = Long.valueOf(967428922);
        Boolean b1 = Boolean.valueOf("truE");
        Boolean b3 = Boolean.valueOf("truEFuck");
        Boolean b2 = Boolean.valueOf("true");

        // Integer i = 4120;
        // i = i + 1;
        // Integer i = new Integer(412);

        System.out.println(i);
        System.out.println(l);
        System.out.println(b1 + "     " + b2 + "      " + b3);

    }
}