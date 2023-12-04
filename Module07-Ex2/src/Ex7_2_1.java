import java.io.*;

public class Ex7_2_1 {
    public static void main(String[] args) {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("続けて文字を入力してください。endで終了します。");
        try {
            File file = new File("test2.txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            String str = "";
            while (true) {
                str = r.readLine();
                if (str.equals("end")) {
                    break;
                }
                bw.write(str);
                bw.newLine();
            }
            System.out.println("処理を終了します。");
            bw.close();
            fw.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
