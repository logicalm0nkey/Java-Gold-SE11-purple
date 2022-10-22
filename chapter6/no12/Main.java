package chapter6.no12;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("ami", "hoge", "fuga");
        // h から始まる要素だけを取得して表示。
        stream1.filter(s -> s.startsWith("h")).forEach(System.out::println);
        System.out.println();

        Stream<String> stream2 = Stream.of("", "hoge", "fuga");
        // 空文字でない文字列だけを取得して表示
        stream2.filter(Predicate.not(s -> s.isEmpty())).forEach(System.out::println);
        System.out.println();

        Stream<String> stream3 = Stream.of("ami", "hoge", "fuga", "hoge");
        // 重複を除いて表示
        stream3.distinct().forEach(System.out::println);
    }
}
