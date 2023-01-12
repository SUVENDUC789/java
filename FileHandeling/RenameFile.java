import java.io.*;

public class RenameFile {
    public static void main(String[] args) {
        File old = new File("Test\\t1.txt");
        File newFile = new File("Test\\Suvendu.txt");

        if (old.exists()) {
            System.out.println(old.getName() + " ---> " + newFile.getName() + " (Renamed : )" + old.renameTo(newFile));
        } else if (newFile.exists()) {
            System.out.println(newFile.getName() + " ---> " + old.getName() + " (Renamed : )" + newFile.renameTo(old));
        } else {
            System.out.println("File does not exist");
        }

    }
}
