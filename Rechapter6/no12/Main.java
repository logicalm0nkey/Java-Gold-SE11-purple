package Rechapter6.no12;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // iterate で要素を生成
        IntStream.iterate(1, n -> n + 1)
                // limit で要素数を制限
                .limit(10L)
                // 出力（実際はここでイテレーションされて、 iterate や limit が実行される）
                .forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 1 <= n <= 10 で要素を生成
        IntStream.rangeClosed(1, 10)
                // 先頭5個を要素から排除（要素の生成からスキップ）
                .skip(5L)
                .forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 要素を生成
        IntStream.iterate(1, n -> n + 1)
                // 先頭の100個をスキップ
                .skip(100L)
                // 要素数の上限5
                .limit(5L)
                .forEach(i -> System.out.print(i + " "));
        System.out.println();

        // "Java" を無限に生成
        Stream<String> stream = Stream.generate(() -> "Java");
        // 3つだけ表示
        stream.limit(3L).forEach(s -> System.out.print(s + " "));
    }
}
