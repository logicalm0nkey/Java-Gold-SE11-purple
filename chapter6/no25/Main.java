package chapter6.no25;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Collectors.groupingBy(Function, Collector) の例。
        // 第2引数の Collector で、groupingBy() の結果の Map<K, List<T>> の List への操作を定義する。
        // 今回なら List を Set に変換してる。
        Stream<String> stream1 = Stream.of("belle", "akko", "ami", "bob", "nao");
        Map<String, Set<String>> map1 = stream1.collect(Collectors.groupingBy(
                s -> s.substring(0, 1),
                Collectors.toSet()));
        System.out.println(map1);

        // ここでは List の要素を joining() で連結してる。
        Stream<String> stream2 = Stream.of("belle", "akko", "ami", "bob", "nao");
        Map<String, String> map2 = stream2.collect(Collectors.groupingBy(
                s -> s.substring(0, 1),
                Collectors.joining()));
        System.out.println(map2);
        System.out.println(map2.getClass());

        // Collectors.groupingBy(Function, Supplier, Collector) の例。
        // 第2引数の Supplier で、 groupingBy の結果の Map<K, List<T>> を別の Map オブジェクトに変換する。
        // 今回なら TreeMap に変換してる。
        // その後？ Collector で List を操作する。
        Stream<String> stream3 = Stream.of("belle", "akko", "ami", "bob", "nao");
        Map<String, String> map3 = stream3.collect(Collectors.groupingBy(
                s -> s.substring(0, 1),
                () -> new TreeMap<>(),
                Collectors.joining()));
        System.out.println(map3);
        System.out.println(map3.getClass());
    }
}
