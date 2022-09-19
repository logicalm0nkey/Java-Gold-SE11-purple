package chapter4.no20;

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

class G<T> {
    private T var;

    public void setVar(T var) {
        this.var = var;
    }

    public T getVar() {
        return var;
    }
}

public class Main {
    public static void main(String[] args) {
        List<X> listX = new ArrayList<>();
        listX.add(new X());

        List<Y> listY = new ArrayList<>();
        listY.add(new Y());

        methodX(listX);
        methodX(listY);

        methodY(listX);
        methodY(listY);

        G<?> g = new G<>();
        // メソッドの引数で型パラメータが使用されているときは、
        // ワイルドカードを使った参照変数を経由してそのメソッドを使うことができない。
        // コンパイルエラー
        // g.setVar("hoge");

        G<? super X> g2 = new G<>();
        // これはコンパイルが通る。
        // super の時だけ、元のクラス（super の後ろで宣言したクラス）を型パラメータに代入できる。
        g2.setVar(new X());
    }

    // 引数で受け取るリストの要素は X クラス又はそのサブクラス
    public static void methodX(List<? extends X> list) {
        // これらはコンパイルエラー。
        // list.add(new X());
        // list.add(new Y());
        System.out.println(list.get(0));
    }

    // 引数で受け取るリストの要素は Y クラス又はそのスーパークラス
    public static void methodY(List<? super Y> list) {
        // これだけコンパイルエラー。
        // list.add(new X());
        // これはコンパイルが通る。
        // super の時だけ、元のクラス（super の後ろで宣言したクラス）を型パラメータに代入できる。
        list.add(new Y());
        System.out.println(list.get(0));
    }
}
