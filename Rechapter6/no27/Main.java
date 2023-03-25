package Rechapter6.no27;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("naoki", "akko", "ami");
        // 文字列の自然順序昇順にした時の最小値
        // minBy の戻り値は Optional
        Optional<String> optional1 = stream1.collect(Collectors.minBy(Comparator.naturalOrder()));
        System.out.println(optional1.get());

        Stream<String> stream2 = Stream.of("101", "105", "106", "203", "205");
        // イニシャルで分類 -> 自然順序昇順にして最大値を取得 -> 戻り値の Map へ
        Map<String, Optional<String>> map = stream2.collect(Collectors.groupingBy(
            s -> s.substring(0, 1),
            Collectors.maxBy(Comparator.naturalOrder())
        ));
        System.out.println(map);
    }
}
