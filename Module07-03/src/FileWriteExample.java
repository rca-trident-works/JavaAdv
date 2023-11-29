import java.io.*;

public class FileWriteExample {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < 10; i++) {
                bw.write("[" + i + "] ");
                bw.newLine();
            }
            bw.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
