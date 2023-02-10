package Rechapter5.no3;

// 関数型インターフェースであることを明示するアノテーション
// 規約に反するとコンパイルエラー
@FunctionalInterface
interface MyFuncInter<T> {
    // 唯一の抽象メソッド
    void foo(T t);

    // Object クラスのメソッドは抽象メソッドとして宣言可能
    String toString();

    boolean equals(Object obj);

    // static メソッドも宣言可能
    static void X() {
    }

    // default メソッドも宣言可能
    default void Y() {
    }

    // private メソッドも宣言可能
    private void Z() {
    }

    // とにかく、抽象メソッドが一意であればよい
}

public class Main {

}
