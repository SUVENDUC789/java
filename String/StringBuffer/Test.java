public class Test {
    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("Suvendu");
        StringBuffer sb2 = sb1.append("Hi");
        // StringBuffer sb2 = new StringBuffer("Suvendu");

        System.out.println(sb1.equals(sb2));

        // StringBuffer sb = new StringBuffer("Rahul".length());
        StringBuffer sb = new StringBuffer();

        // Default capacity 16
        System.out.println(sb.capacity());

        sb.append("Suvendu");
        sb.append(" ");
        sb.append("Chowdhury");
        // System.out.println(sb.substring(1));
        System.out.println(sb.length());
        System.out.println(sb.capacity());// (16*2)+2
    }

}