package Rechapter6.no20;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("naoki", "akko", "ami");
        // Collectors.toSet() は引数いらない。そのまま Set にする。
        Set<String> set = stream1.collect(Collectors.toSet());
        System.out.println(set);

        Stream<String> stream2 = Stream.of("naoki", "akko", "ami");
        // Collectors.toMap() メソッドで、 stream の要素を基に Map を作る。
        // stream の要素（String） -> collect() -> 要素を基に key, value を作る
        Map<String, String> map = stream2.collect(Collectors.toMap(s -> s, String::toUpperCase));
        System.out.println(map);
    }
}
