package Rechapter3.no4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            FileReader fr = new FileReader("a.txt");
            fr.read();
        } catch (ArithmeticException | FileNotFoundException e) {
            // マルチキャッチで宣言した参照変数は実質 final となるので、値の再代入ができない。
            // 以下のコードはコンパイルエラー。
            e = null;
        } catch (IOException e) {
            // 一方、1個の例外クラスをキャッチするときは再代入可能。
            e = null;
        }
    }
}
