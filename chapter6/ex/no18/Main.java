package chapter6.ex.no18;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Collectors.partitioningBy() メソッドを使った時の戻り値の型宣言1
        // Map のキーは必ず Boolean 型。 boolean だとダメなので注意。
        // 通常のままだと値は List<T> となる。
        Map<Boolean, List<Integer>> result1 = Stream.of(10, 20, 30)
                .collect(Collectors.partitioningBy(i -> i > 10));

        // Collectors.partitioningBy() メソッドを使った時の戻り値の型宣言2
        // Collectors.partitioningBy() メソッドの第2引数で Collectors.toSet() メソッドを宣言すると、
        // 通常の戻り値の List<T> を Set<T> に変換してくれる。
        Map<Boolean, Set<Integer>> result2 = Stream.of(10, 20, 30)
                .collect(Collectors.partitioningBy(i -> i > 10, Collectors.toSet()));
    }
}
