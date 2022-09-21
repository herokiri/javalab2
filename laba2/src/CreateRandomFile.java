import java.io.*;

public class CreateRandomFile {

    static void createFile(String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            String [] days = new String[] {"Monday", "Tuesday" ,"Wednesday", "Thursday", "Saturday", "Sunday"};
            int j = 0;
            for(; j < 1000; j++) {
                String line = "";
                int max = 1000;
                for (int i = 0; i < 4; i++) {
                    int k = (int) (Math.random() * ++max);
                    line += (k + ".");
                }
                max = 100;
                line += (int) (Math.random() * ++max);
                line += " ";
                int m = 24;
                int min = 0;

                int k = (int) (Math.random() * ++m) + min;
                line += (k + ":");
                m = 60;
                k = (int) (Math.random() * ++m) + min;
                line += (k + ":");
                k = (int) (Math.random() * ++m) + min;
                line += (k + " ");
                line += (days[(j % days.length)]);

                writer.write(line);
                writer.newLine();

        }


    }

}
