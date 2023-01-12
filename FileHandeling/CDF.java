import java.io.*;

public class CDF {
    public static void main(String[] args) throws Exception {

        FileInputStream r = new FileInputStream("Test\\t.txt");
        FileOutputStream w = new FileOutputStream("Test\\Another.txt");

        int i;
        while ((i = r.read()) != -1) {
            w.write((char) i);
        }

        System.out.println("Content copyed successfully");

    }
}
