// package StringBulder;



public class Test {
    public static void main(String[] args) {

        String s = "   suv";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);

        sb=trim(sb);

        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());
        // System.out.println();

    }

    private static StringBuilder trim(StringBuilder sb) {
        
        return null;
    }
}
