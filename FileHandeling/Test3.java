
import java.io.*;

public class Test3 {

    public static void main(String[] args) {

        try {
            FilterWriter fw = new FilterWriter("wr.txt");
            try {
                fw.write("Hi bro !");
            } finally {
                fw.close();
            }
            System.out.println("File write successfully ...");
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
