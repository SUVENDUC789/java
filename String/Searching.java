public class Searching {
    public static void main(String[] args) {
        final String s = "Hi i am Suvendu";
        System.out.println(s.indexOf('S'));// 8
        System.out.println(s.indexOf("am"));// 5
        System.out.println(s.charAt(3));// i

        // Return type is boolean
        System.out.println(s.contains("Hi"));
        System.out.println(s.startsWith("Hi"));
        System.out.println(s.endsWith("Hi"));

        final String s1 = "Queen";
        System.out.println(s1.lastIndexOf('e'));// 3

    }
}
