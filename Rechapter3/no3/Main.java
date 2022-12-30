package Rechapter3.no3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("a.txt");
            fr.read();
        } catch (FileNotFoundException | IOException i) {
            // 継承関係にある例外クラスは | で区切って併記できない。
        }
    }
}
