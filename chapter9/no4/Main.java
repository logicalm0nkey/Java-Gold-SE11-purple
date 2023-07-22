package chapter9.no4;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter(new File("./chapter9/no4/data.txt"));
                FileReader fr = new FileReader(new File("./chapter9/no4/data.txt"))) {
            // write メソッドはバッファに書き込む
            fw.write("田中");
            // flush メソッドは、バッファの内容を物理領域に書き込む
            fw.flush();

            int i = 0;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
