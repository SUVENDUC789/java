public class Test3 extends Suvendu {

    // Static method belongs to the class not for the objects
    public static void main(String[] args) {

        Test3 a = new Test3();
        Test3 b = new Test3();
        Test3 c = new Test3();
        // Test3 d = new Test3();//-->Uncomment it and run it
        // Test3 e = new Test3();

    }
}

class Suvendu {
    private static int count = 0;

    Suvendu() {
        if (count == 3) {
            System.out.println("Maximum 3 Object created bro !");
            System.exit(0);
        }
        count += 1;
        System.out.println(count + " Object create successfully ");

    }
}
