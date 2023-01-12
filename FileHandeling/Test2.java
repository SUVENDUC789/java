import java.io.*;

public class Test2 {
    public static void main(String[] args) {

        File f = new File("Test\\t.txt");

        if (f.exists()) {
            System.out.println("File name : " + f.getName());
            System.out.println("File path : " + f.getAbsolutePath());
            System.out.println("File writeable : " + f.canWrite());
            System.out.println("File readable : " + f.canRead());
            System.out.println("File size : " + f.length()+" byte");
            System.out.println("File remove : " + f.delete());
        } else {
            System.out.println("File not exists...");
        }

    }

}
