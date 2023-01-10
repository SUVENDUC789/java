public class Test {
    public static void main(String[] args) {
        // two types of exception present in java
        // --- Some exception are checked or compile time exception
        // --- Some exception are un-checked or run time exception

        // example of runtime exception
        try {

            int a = 10, b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            /*
             * exception object provide three thinks
             * - one is exception class name
             * - second is description
             * - third is stack trace
             */
            System.out.println(e);// this is provide two thinks one is exception class another is description .
            System.out.println(e.toString());// this is provide two thinks one is exception class another is description.
            System.out.println(e.getMessage());// this is provide only description
            e.printStackTrace();// this provide three thinks
        }
        System.out.println("Programe terminate successfully ...(All about exception in java with SUVENDU CHOWDHURY)");
    }
}