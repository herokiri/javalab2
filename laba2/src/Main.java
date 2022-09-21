import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String filename = "main.txt";
        CreateRandomFile.createFile(filename);
        files1.stripDuplicatesFromFile(filename);

        files2.removingFirstElements(filename);
    }
}