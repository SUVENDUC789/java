public class GarbageCollection {
    // static private int i = 0;

    public void finalize() {
        System.out.println("Garbage collect By suvendu ");
    }

    public static void main(String[] args) {

        GarbageCollection g1 = new GarbageCollection();
        GarbageCollection g2 = new GarbageCollection();

        g1 = g2 = null;
        System.gc();

    }
}
