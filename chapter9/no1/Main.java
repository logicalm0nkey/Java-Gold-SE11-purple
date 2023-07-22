package chapter9.no1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            // file path を指定しないと、実行時の current directory にファイルを作成するので注意
            fileOutputStream = new FileOutputStream(new File("./chapter9/no1/data.txt"));
            fileOutputStream.write(0);
            fileOutputStream.write("abc".getBytes());
            fileOutputStream.write(99);

            fileInputStream = new FileInputStream(new File("./chapter9/no1/data.txt"));
            int data = 0;
            // FileInputStream.read() は、ファイルの終端に達すると -1 を返す
            while ((data = fileInputStream.read()) != -1) {
                System.out.print(data + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("file does not exists.");
        } catch (IOException e) {
            System.out.println("IOException.");
        } finally {
            try {
                // close() メソッドも IOException を throw するから、こう書かないとコンパイルエラーとなる
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {

            }

        }
    }
}
