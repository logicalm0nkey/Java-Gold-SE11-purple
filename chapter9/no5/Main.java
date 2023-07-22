package chapter9.no5;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("./chapter9/no5/data.txt"));
                BufferedReader br = new BufferedReader(new FileReader("./chapter9/no5/data.txt"))) {
            // バッファに書き込み
            bw.write("hello");
            // バッファに改行文字を挿入
            bw.newLine();
            // バッファに書き込み
            bw.write("おはようだよ！");
            // ファイルに出力
            bw.flush();

            String line = null;
            // readLine は EOF に到達すると null を返す
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
