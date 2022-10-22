package chapter6.no24;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Collectors.groupingBy() メソッドの例。
        // groupingBy() の引数の Function で指定したルールで Stream の要素をまとめる。
        // groupingBy() の戻り値は Map<K, List<T>> 。 K は Function の戻り値の型、 T は Stream の要素の型。
        // Function の結果を key にして、その key でグルーピングした Stream の要素を List 化する、という感じか。
        Stream<String> stream = Stream.of("belle", "akko", "ami", "bob", "nao");
        Map<String, List<String>> map = stream.collect(Collectors.groupingBy(
                s -> s.substring(0, 1)));
        System.out.println(map);
    }
}
