package chapter3.no4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 10/0;
            FileReader fr = new FileReader("a.txt");
            fr.read();
        } catch (ArithmeticException | FileNotFoundException e) {
            // マルチキャッチに記述した参照変数（今回はe）は final となる
            // コンパイルエラー
            e = null;
        } catch (IOException e) {
            // 単一のキャッチの場合は final にならない。
            e = null;
        }
    }
}
