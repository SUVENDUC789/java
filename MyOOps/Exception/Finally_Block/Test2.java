import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("Test108.java");
            System.out.println(fis);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    // // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
            System.out.println("File closed");
        }

    }
}
