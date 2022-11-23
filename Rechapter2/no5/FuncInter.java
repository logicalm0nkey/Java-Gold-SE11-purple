package Rechapter2.no5;

@FunctionalInterface
public interface FuncInter {
    // @FunctionalInterface を使用すると、関数型インターフェースの要件を満たしていない場合にコンパイルエラーとなる。
    boolean equals(Object obj);
}
