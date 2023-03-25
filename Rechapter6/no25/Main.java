package Rechapter6.no25;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(3, 5, 7, 9);
        // 5より大きい値と5以下の値で分類
        Map<Boolean, List<Integer>> map1 = stream1.collect(Collectors.partitioningBy(
            s -> s > 5
        ));
        System.out.println(map1);

        Stream<Integer> stream2 = Stream.of(3, 5, 7, 9);
        // 10より大きいか否かで分類（true をキーにした value が空のリストになる）
        Map<Boolean, List<Integer>> map2 = stream2.collect(Collectors.partitioningBy(
            s -> s > 10
        ));
        System.out.println(map2);

        Stream<Integer> stream3 = Stream.of(3, 5, 7, 9);
        // 5より大きいか否かで分類
        // stream -> summingInt(n -> n) で分類した結果を加算 -> Map に格納
        Map<Boolean, Integer> map3 = stream3.collect(Collectors.partitioningBy(
            s -> s > 5,
            Collectors.summingInt(n -> n)
        ));
        System.out.println(map3);
    }
}
