package chapter9.no6;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("./chapter9/no6/data.txt"))) {
            // apple\n を読み込み
            System.out.println(br.readLine());
            // 2行目の先頭にマークを付ける
            br.mark(256);
            // 2, 3 行目を読み込み
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            // マークを付けた位置に stream の場所をリセットする（バッファのカーソル的なものを戻す）
            br.reset();
            // ここでは再び2行目が読み込まれる
            System.out.println(br.readLine());
            // 2文字スキップする
            br.skip(2);
            // banana の先頭2文字がスキップされて nana が出力される
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
