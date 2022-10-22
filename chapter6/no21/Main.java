package chapter6.no21;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Collectors.toSet() メソッドを使って、 Stream を Set へ変換。
        Stream<String> stream1 = Stream.of("hoge", "pk", "kokoko");
        Set<String> set = stream1.collect(Collectors.toSet());
        System.out.println(set);

        // Collectors.toMap() メソッドを使って Stream を Map へ変換。
        // Map へ変換するので、 toMap() の引数は2つの Function インターフェースを指定する必要がある。
        // 1個目の Function が key で2個目の Function が value 。
        Stream<String> stream2 = Stream.of("hoge", "pk", "kokoko");
        Map<String, String> map = stream2.collect(Collectors.toMap(s -> s, String::toUpperCase));
        System.out.println(map);
    }
}
