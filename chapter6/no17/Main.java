package chapter6.no17;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // peek() メソッドの例
        List<String> list = Stream.of("one", "two", "three", "four", "three")
                .filter(s -> s.length() > 3)
                // こんな感じでデバッグ目的で使われるメソッド
                .peek(s -> System.out.println("After filter: " + s))
                .distinct()
                // 何らかの中間操作の結果を表示するために使う
                .peek(s -> System.out.println("After distinct: " + s))
                .map(String::toUpperCase)
                // peek() の引数は Consumer 。
                .peek(s -> System.out.println("After map: " + s))
                .collect(Collectors.toList());
    }
}
