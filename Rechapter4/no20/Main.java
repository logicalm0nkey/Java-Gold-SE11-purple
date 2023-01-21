package Rechapter4.no20;

import java.util.*;

class X {
    public String toString() {
        return "X";
    }
}

class Y extends X {
    public String toString() {
        return "Y";
    }
}

public class Main {
    // 引数で受け取るリストの要素は X クラス又はそのサブクラスに限る
    public static void methodX(List<? extends X> list) {
        // コンパイルエラー
        // 実行時にしかワイルドカードの型が判別できないため、型が決まっていないとダメな add() メソッドはコンパイルエラーとなる
        // list.add(new X());
        // 同様にコンパイルエラー
        // list.add(new Y());

        System.out.print(list.get(0) + " ");
    }

    // 引数で受け取るリストの要素は Y クラス又はそのスーパークラスに限る
    public static void methodY(List<? super Y> list) {
        // 上と同様にコンパイルエラー
        // list.add(new X());
        // ? super T の場合のみ、 T 型のオブジェクトを格納できる
        list.add(new Y());

        System.out.print(list.get(0) + " ");
    }

    public static void main(String[] args) {
        List<X> listX = new ArrayList<>();
        listX.add(new X());

        List<Y> listY = new ArrayList<>();
        listY.add(new Y());

        // methodX に X 型のオブジェクトを格納したリストを渡す
        methodX(listX);
        // methodX に Y 型のオブジェクトを格納したリストを渡す
        methodX(listY);

        // methodY に X 型のオブジェクトを格納したリストを渡す
        methodY(listX);
        // methodY に Y 型のオブジェクトを格納したリストを渡す
        methodY(listY);
    }
}
