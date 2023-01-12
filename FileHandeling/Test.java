import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException {

        File f = new File("Test\\t.txt");

        if (f.createNewFile()) {
            System.out.println("File was created successfully");
        } else {
            System.out.println("File already created...");
        }

    }
}