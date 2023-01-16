interface Suvendu {
    // double marks = 7.1;// public static final (implicitly compiler set)

    void details();// public abstarct (implicitly compiler set)

    // Also contain static method
    static void diolog() {
        System.out.println("I am a Iron man");
    }
}

interface Debarpan {
    double marks = 7.3;// public static final (implicitly compiler set)

    // void display();// public abstract (implicitly compiler set)

    void favlang();// public abstarct (implicitly compiler set)

    // you also create default method in interface 
    default void afterclg() {
        System.out.println("After clg i became rest");
    }
}

// self det
class Mydet implements Suvendu, Debarpan {
    /*
     * - Interface use implicitly (public abstarct) so override method use same
     * - access modifier or hight preference access modifier
     */
    @Override
    public void details() {
        System.out.println("My Name is Suvendu Chowdhury");
        System.out.println("S-412");
        System.out.println(marks);
        Suvendu.diolog();
    }

    /*
     * - Interface use implicitly (public abstarct) so override method use same
     * - access modifier or hight preference access modifier
     */
    @Override
    public void favlang() {
        System.out.println("Fav lang : C,C++,Java,Python");
        afterclg();

    }

}

interface Test {
    public static void main(String[] args) {
        Mydet o = new Mydet();
        o.details();
        o.favlang();
    }

}