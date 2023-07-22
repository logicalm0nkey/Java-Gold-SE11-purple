package chapter9.no3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("./chapter9/no3/data.txt"));
                DataInputStream dis = new DataInputStream(new FileInputStream("./chapter9/no3/data.txt"))) {
            dos.writeInt(100);
            dos.writeUTF("hoge");
            dos.writeUTF("ほげ");

            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());  // ここで readInt を呼ぶと EOFException が発生する。なんで？
            System.out.println(dis.readUTF());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
