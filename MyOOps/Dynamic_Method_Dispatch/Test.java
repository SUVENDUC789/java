public class Test {
    public static void main(String[] args) {

        // Parent class Object refer to child class refernce
        Debashis db = new Suvendu();

        // But Child class Object does't refer to Parent class refernce
        // Suvendu suv = new Debashis();
        db.name();
        db.greet();
        // db.wish();

    }
}

class Debashis {
    void greet() {
        System.out.println("Good morning (Daily wish)");
    }

    void name() {
        System.out.println("My name is Debashis Chowdhury");
    }

}

class Suvendu extends Debashis {

    @Override
    void name() {
        System.out.println("My name is Suvendu Chowdhury");
    }

    void wish() {
        System.out.println("Happy birth day wish only(Poida divas)");
    }
}
