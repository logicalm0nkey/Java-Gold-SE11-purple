package Rechapter2.no3;

@FunctionalInterface
public interface FuncInter<T> {
    // 唯一の抽象メソッド。関数型インターフェースの要件を満たすために必要。
    void foo(T t);

    // Object 型の toString() メソッドのオーバーライド。
    // 関数型インターフェースでは Object 型のメソッドを抽象メソッドとして宣言できる。
    // 実装クラスで toString() メソッドなどを強制的にオーバーライドさせたいときに使う。
    String toString();

    // Object 型の equals() メソッドのオーバーライド。
    boolean equals(Object obj);

    // static メソッドも宣言可能。
    static void X() {

    }

    // default メソッドも宣言可能。
    default void Y() {

    }

    // private メソッドも宣言可能。
    private void Z() {

    }
}
