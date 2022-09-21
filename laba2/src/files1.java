
import java.io.*;
import java.util.HashMap;


public class files1 {

    static void stripDuplicatesFromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        HashMap<String, Integer> lines = new HashMap<>(); // храним ключ - значение


        String line;
        while ((line = reader.readLine()) != null) {
            String[] l = line.split(" ");
            lines.merge(l[0], 1, Integer::sum); // высчитываем количество различных ip
        }
        reader.close();

        String newFile = "result.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
        for(HashMap.Entry entry : lines.entrySet()) {
            String newLine = entry.toString() + " посещений";
            writer.write(newLine);
            writer.newLine();
        }
        writer.close();
    }

}
