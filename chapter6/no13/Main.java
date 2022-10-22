package chapter6.no13;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // IntStream.iterate() メソッドで、初期値1、公差1の無限等差数列を作成。
        // その後、最大10個までの制限を与える。そして表示。
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        // 1以上10以下の閉区間を作成。その後先頭5個を除いて表示。
        IntStream.rangeClosed(1, 10)
                .skip(5)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        // 初期値1、公差1の無限等差数列を作成。先頭100個を除いて、上限5個を表示。即ち101～105を表示。
        IntStream.iterate(1, n -> n + 1)
                .skip(100)
                .limit(5)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        // Stream.generate() メソッドで Stream を作成。
        // generate() メソッドは指定された Supplier の結果を無限に生成する。
        Stream<String> stream = Stream.generate(() -> "Java");
        // 無限に生成される結果を最大3個に制限して表示。
        stream.limit(3).forEach(x -> System.out.print(x + " "));
    }
}
