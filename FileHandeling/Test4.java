// java program to read a text from file
import java.io.*;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("File content is :>");
        try {
            FileReader fr = new FileReader("Test\\t.txt");
            try {
                int i;
                while ((i = fr.read()) != -1) {
                    System.out.print((char) i);
                }
            } finally {
                fr.close();
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
