package Rechapter6.no21;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("nao", "akko", "ami");
        // stream の要素（String） -> collect() -> [String, Integer]
        Map<String, Integer> map1 = stream1.collect(Collectors.toMap(s -> s, String::length));
        System.out.println(map1);

        Stream<String> stream2 = Stream.of("nao", "akko", "ami");
        // stream の要素（String） -> collect() -> [Integer, String]
        // 長さが同じ要素があるので key が重複して実行時エラーとなる
        Map<Integer, String> map2 = stream2.collect(Collectors.toMap(String::length, s -> s));
        System.out.println(map2);
    }
}
