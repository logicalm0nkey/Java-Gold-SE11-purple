package chapter6.no26;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Collectors.partitioningBy(Predicate) の例。
        // 戻り値は Map<Boolean, List<T>> 。 true or false で要素を分割 (partition) するって感じか
        Stream<Integer> stream1 = Stream.of(2, 5, 7, 9);
        Map<Boolean, List<Integer>> map1 = stream1.collect(Collectors.partitioningBy(v -> v > 5));
        System.out.println(map1);

        // Predicate の結果が true になる要素が無くてもOK。 false の List が充足されるだけ。
        Stream<Integer> stream2 = Stream.of(2, 5, 7, 9);
        Map<Boolean, List<Integer>> map2 = stream2.collect(Collectors.partitioningBy(v -> v > 10));
        System.out.println(map2);

        // partitioningBy の第2引数に Collector を指定すると、戻り値の Map の value (List) を操作できる。
        // 今回なら summingInt で総和を出力するように操作している。
        Stream<Integer> stream3 = Stream.of(2, 5, 7, 9);
        Map<Boolean, Integer> map3 = stream3.collect(Collectors.partitioningBy(
                v -> v > 5,
                Collectors.summingInt(n -> n)));
        System.out.println(map3);

    }
}
