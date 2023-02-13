class Variadic {
    static int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(10, 20, 30, 40, 5));

    }
}