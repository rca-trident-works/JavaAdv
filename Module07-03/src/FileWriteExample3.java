import java.io.*;

public class FileWriteExample3 {
    public static void main(String[] args) {
        try {
            File file = new File("test2.txt");
            FileWriter fw = new FileWriter(file);
            for (int i = 200; i < 205; i++) {
                fw.write("[" + i + "] \n");
            }
            fw.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}

