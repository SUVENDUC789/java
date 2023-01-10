public class MyObjectTut {
    public static void main(String[] args) {
        checkObject(1);
        checkObject(2.2f);
        checkObject("Suvendu Chowdhury");
        checkObject(6.321d);
    }

    public static void checkObject(Object input) {

        if (input instanceof Integer) {
            System.out.println(input + "    Is the  " + input.getClass().getTypeName());
        } else if (input instanceof Float) {
            System.out.println(input + "    Is the     " + input.getClass().getTypeName());
        } else if (input instanceof String) {
            System.out.println(input + "    Is the    " + input.getClass().getTypeName());
        } else {
            System.out.println(input + "    Is the    " + input.getClass().getTypeName());
        }

    }
}