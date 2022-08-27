package chapter2.no4;

@FunctionalInterface
public interface FuncInter {
    // Object クラスのメソッドだけを宣言すると関数型インターフェースの要件を満たせない。
    // コンパイルエラー。
    boolean equals(Object obj);

    // Object クラスのメソッド以外の抽象メソッドが必要。
}
