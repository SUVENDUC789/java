import java.util.Arrays;

public class Conversion {
    public static void main(String[] args) {
        final String s = "My name is Rahul";
        System.out.println(s.toLowerCase());// my name is rahul
        System.out.println(s.toUpperCase());// MY NAME IS RAHUL

        // Number to String Convertion
        int a = 967428922;
        float kg = 95.63f;
        String number = String.valueOf(a + kg);
        System.out.println(number);

        // String to character Array convertion
        String myphone = "7797841111";
        char ch[] = myphone.toCharArray();
        System.out.println(Arrays.toString(ch));

    }
}
