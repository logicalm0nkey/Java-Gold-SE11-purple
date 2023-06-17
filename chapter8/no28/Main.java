package chapter8.no28;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("belle", "akko", "ami", "bob", "nao").parallel();

        // マルチスレッドにおいて、先頭1文字で要素をグルーピングした ConcurrentMap を返す
        Map<String, List<String>> map1 = stream1.collect(
                Collectors.groupingByConcurrent(
                        s -> s.substring(0, 1)));

        System.out.println(map1);
        System.out.println("map1 のクラス名: " + map1.getClass());

        Stream<String> stream2 = Stream.of("nao", "akko", "amo").parallel();

        Map<Integer, String> map2 = stream2.collect(
                Collectors.toConcurrentMap(
                        // s -> s.length(),
                        String::length,
                        s -> s,
                        (s1, s2) -> s1 + " : " + s2));
        System.out.println(map2);
        System.out.println("map2 のクラス名: " + map2.getClass());
    }
}
