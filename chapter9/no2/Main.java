package chapter9.no2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // try-with-resources の try ブロックで複数のオブジェクトを new する際は、毎回文末に ; を打つ必要がある
        try (FileOutputStream fos = new FileOutputStream(new File("./chapter9/no2/data.txt"));
                FileInputStream fis = new FileInputStream(new File("./chapter9/no2/data.txt"))) {
            fos.write(0);
            fos.write("abc".getBytes());
            fos.write(99);

            int data = 0;
            while ((data = fis.read()) != -1) {
                System.out.print(data + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}
