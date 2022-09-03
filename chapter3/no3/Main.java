package chapter3.no3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("a.txt");
            fr.read();
        } catch (FileNotFoundException e) {
            // 継承関係にある例外は、具象クラスから先に catch を書く
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // try {
        //     FileReader fr = new FileReader("a.txt");
        //     fr.read();
        // } catch (FileNotFoundException | IOException e) {
        //     // 継承関係にある例外はマルチキャッチできない
        //     // コンパイルエラー。
        // }

        
    }
}
