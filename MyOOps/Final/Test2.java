public class Test2 {
    public static void main(String[] args) {

        Debarpan d = new Debarpan();
        d.debu();

    }
}

class Suvendu {
    /*
     * You cannot override detailsSuv() method
     * because using final keyword
     */
    final void detailsSuv() {
        System.out.println("My name is Suvendu Chowdhury");
    }
}

class Debarpan extends Suvendu {

    void debu() {
        System.out.println("Debarpan Mondol");
        System.out.println("[Friend name :]");
        super.detailsSuv();
    }
    // @Override
    // void detailsSuv() {
    // super.detailsSuv();
    // }
}
