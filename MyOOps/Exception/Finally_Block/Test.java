class Test {
    public static void main(String[] args) {
        try {
            int a = 100, b = 0;
            System.out.println(a / b);

        } catch (Exception e) {
            System.out.println("I am in Exception block");
        } finally {
            System.out.println("I am in finally block");
        }
    }
}