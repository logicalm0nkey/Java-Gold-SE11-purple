package chapter9.no9;

import java.io.*;

class Foo {
    int a;

    Foo() {
        a = 10;

        System.out.println("Foo()");
    }
}

// Serializable 実装クラス
class Bar extends Foo implements Serializable {
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

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./chapter9/no9/data.txt"));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./chapter9/no9/data.txt"))) {
            // Serialize
            // ここでファイルに書き込まれる（Serialize される）のは Bar オブジェクトだけ
            oos.writeObject(bar);

            // Deserialize (cast to Bar)
            // Deserialize する際、 Bar は直接ファイルからオブジェクトが生成されるが、 Foo はされない。
            // 親クラスが Serializable でないときは、 Deserialize したときに親クラスの自明なコンストラクタが起動して new される。
            // 今回なら、 Deserialize する際に、 Foo() が呼ばれて、新しい Foo インスタンスが作られる。
            Bar readBar = (Bar)ois.readObject();

            System.out.println("readBar.a = " + readBar.a);
            System.out.println("readBar.b = " + readBar.b);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
