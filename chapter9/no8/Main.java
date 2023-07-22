package chapter9.no8;

import java.io.*;

// Serializable 実装クラス
class Foo implements Serializable {
    int a;

    Foo() {
        a = 10;

        System.out.println("Foo()");
    }
}

// Serializable 実装クラスを継承したクラス
class Bar extends Foo {
    int b;

    Bar() {
        super();
        b = 10;

        System.out.println("Bar()");
    }
}

public class Main {
    public static void main(String[] args) {
        Bar bar = new Bar();

        bar.a = 100;
        bar.b = 100;

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./chapter9/no8/data.txt"));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./chapter9/no8/data.txt"))) {
            // Serialize
            // Bar クラスの親クラスが Serializable を実装しているから Serialize できる
            oos.writeObject(bar);

            // Deserialize (cast to Bar)
            // Deserialize したときは Class の Constructor は呼び出されない
            // シンプルにファイルから Object が復元される
            Bar readBar = (Bar)ois.readObject();

            System.out.println("readBar.a = " + readBar.a);
            System.out.println("readBar.b = " + readBar.b);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
