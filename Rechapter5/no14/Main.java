package Rechapter5.no14;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // ラムダ式で UnaryOperator を実装
        UnaryOperator<String> operator1 = s -> s.toUpperCase();
        // 当たり前だが、宣言されていない変数をインスタンスメソッド参照で使うことはできない（以下の s の話）
        // コンパイルエラー
        // UnaryOperator<String> operator2 = s::toUpperCase;

        // クラス名を使ったインスタンスメソッド参照
        UnaryOperator<String> operator2 = String::toUpperCase;
        // "hoge" が上の String に代わるインスタンスとして扱われる
        System.out.print(operator2.apply("hoge"));
    }
}
