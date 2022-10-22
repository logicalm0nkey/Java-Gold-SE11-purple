package chapter6.no27;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Stream の変換をする map() メソッド (例かつ復習)。 map は中間操作。
        // Stream の各要素を大文字にした Stream を作成して、その結果の要素を連結する処理。
        Stream<String> stream1 = Stream.of("hoge", "pk", "koko");
        String result1 = stream1.map(String::toUpperCase).collect(Collectors.joining(":"));
        System.out.println(result1);

        // mapping() の例。
        // Stream の要素を大文字に変換して、変換後の要素を連結する。
        // 結果は↑と同じ。
        Stream<String> stream2 = Stream.of("hoge", "pk", "koko");
        String result2 = stream2.collect(Collectors.mapping(
                s -> s.toUpperCase(),
                Collectors.joining(",")));
        System.out.println(result2);
    }
}
