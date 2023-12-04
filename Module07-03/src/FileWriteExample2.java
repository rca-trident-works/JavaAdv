import java.io.*;

public class FileWriteExample2 {
    public static void main(String[] args) {
        try {
            File file = new File("test2.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (int i = 200; i < 205; i++) {
                pw.write("[" + i + "] ");
            }
            pw.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}

