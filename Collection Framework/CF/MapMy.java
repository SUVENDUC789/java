import java.util.*;

public class MapMy {
    public static void main(String[] args) {
        String sen = "thequickbrownfoxjumpsoverthelazydog";

        HashMap<Object, Object> hm = new HashMap<>();

        for (int i = 0; i < sen.length(); i++) {
            hm.put(sen.charAt(i), 0);
        }

        for (int i = 0; i < sen.length(); i++) {
            int c = 0;
            for (int j = 0; j < sen.length(); j++) {
                if (sen.charAt(i) == sen.charAt(j)) {
                    c++;
                }
            }
            hm.put(sen.charAt(i), c);
        }
        System.out.println(hm);

        if (hm.containsKey("bsc")) {
            System.out.println("Key is exit");
        }

        for (int i = 0; i < sen.length(); i++) {
            System.out.println("Key : " + sen.charAt(i) + " Value :" + hm.get(sen.charAt(i)));
        }

    }
}
