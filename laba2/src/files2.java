import java.io.*;
import java.util.Scanner;

public class files2 {
    static void removingFirstElements( String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();

        String line;
        String newFile = "result2.txt";
        BufferedWriter w = new BufferedWriter(new FileWriter(newFile));
        while((line = reader.readLine()) != null) {

            if(line.length() > k) {

                line = line.substring(k);

                w.write(line);
                w.newLine();

            }
        }
        w.close();
    }

}
