package chapter6.ex.no14;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 問題文のコード
        // Stream.iterate(1, i -> i++) // i++ を ++i に変えないと、要素が {1, 1, 2, 3, 4} になる。
        //         .limit(5)
        //         .map(i -> i) // map の戻り値の型を CharSequence インターフェースのオブジェクトに変換しないと Collectors.joining()
        //                      // が使えない。コンパイルエラー。
        //         .collect(Collectors.joining());
        // 全体を出力用のコードで囲まないと結果が出力されない。

        // 改善コード
        // これで出力される。
        System.out.println(
                Stream.iterate(1, i -> ++i) // これで要素が {1, 2, 3, 4, 5} になる。
                        .limit(5)
                        .map(i -> "" + i) // これで map の戻り値が String 型になり、 CharSequence インターフェースのオブジェクトになる。
                        .collect(Collectors.joining()));
    }
}
