package chapter2.no3;

// 関数型インターフェースであることを宣言するアノテーション
@FunctionalInterface
public interface FunInter<T> {
    // 単一の抽象メソッド
    void foo(T t);

    // Object クラスのメソッドは抽象メソッドとして宣言できる
    String toString();

    boolean equals(Object obj);

    // static メソッドも定義可能
    static void X() {
    };

    // private メソッドも定義可能
    private void Y() {
    };

    // 要するに、関数型インターフェースは、 Object クラス以外のメソッドで、
    // 抽象メソッドが1個だけのインターフェースってこと。
}
