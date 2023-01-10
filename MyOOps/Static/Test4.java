// import java.util.Arrays;

/*
 * java version "19.0.1" 2022-10-18
 * Java(TM) SE Runtime Environment (build 19.0.1+10-21)
 * Java HotSpot(TM) 64-Bit Server VM (build 19.0.1+10-21, mixed mode, sharing)
*/

public class Test4 {
    static {
        System.out.println(Suvendu.reverse("12321"));// call static method
        System.out.println(Suvendu.reverse("12321").length());// call static method
        System.out.println(Friends.palindrom("12321"));// call static method
    }
    static {
        System.out.println(Suvendu.reverse("12321"));// call static method
        System.out.println(Suvendu.reverse("12321").length());// call static method
        System.out.println(Friends.palindrom("12321"));// call static method
    }
    static {
        System.out.println(Suvendu.reverse("12321"));// call static method
        System.out.println(Suvendu.reverse("12321").length());// call static method
        System.out.println(Friends.palindrom("12321"));// call static method
    }
    static {
        System.exit(0);
    }

}

class Suvendu {
    static String reverse(String sen) {
        char arr[] = sen.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            // 12345
            char temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }

        String sen2 = new String(arr);
        return sen2;
    }
}

class Friends extends Suvendu {

    public static boolean palindrom(String sentence) {

        return sentence.equals(reverse(sentence));// call parent class static method

    }

}
