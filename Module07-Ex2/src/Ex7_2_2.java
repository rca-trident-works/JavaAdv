import java.io.*;

public class Ex7_2_2 {
    public static void main(String[] args) {
        try {
            File file = new File("test2.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            System.out.println("ファイルの内容を表示します");
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            // ☆☆ 「いやです」の文字を追加 ☆☆
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
                bw.write("いやです!!");
                bw.newLine();
            bw.close();
            fw.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
