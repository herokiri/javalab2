import java.io.*;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class files2 {
    static void removingFirstElements( String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        Scanner sc = new Scanner(System.in);
        int k = 0;

        do {
            System.out.println("Ввод значения для задания 2 : ");
            while (!sc.hasNextInt()) {
                System.out.println("некорректный ввод : ");
                sc.next(); // this is important!
            }
            k = sc.nextInt();
        } while (k < 0);

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
