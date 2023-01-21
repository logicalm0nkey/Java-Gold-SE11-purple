package Rechapter4.no17;

// ジェネリクスを用いたインターフェース宣言
interface MyInt<T> {
    // インターフェース内で型パラメータを使用可能
    void method(T t);
}

// 実装クラスは具体的な型を宣言する
// 今回は String 型
class Foo implements MyInt<String> {
    // メソッドを実装するときは、インターフェースで型パラメータが書かれてるところに具体的な型を書く
    public void method(String s) {
        System.out.println(s);
    }
}

public class Main {
    public static void main(String[] args) {
        // 実装クラスを使う
        new Foo().method("hoge");

        // ジェネリクスを用いたインターフェースを匿名クラスで実装
        // この使い方が効果的な気がする
        // 使いたい場面に応じて型を変えて実装できる
        new MyInt<Integer>() {
            public void method(Integer i) {
                System.out.println(i);
            }
        }.method(10);
    }
}
