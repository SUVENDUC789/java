import java.io.FileInputStream;

class ReadFile {
    void read() throws Exception {
        FileInputStream fis = new FileInputStream("Porn2.java");
    }
}

public class LatsKeyWord {
    public static void main(String[] args) {
        ReadFile s = new ReadFile();
        try {
            s.read();
        } catch (Exception e) {
            // System.out.println();
            e.printStackTrace();

        }

        System.out.println("Programe successfully terminated");

    }
}
