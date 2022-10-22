package chapter6.no28;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // maxBy() メソッドの例。
        // 引数は Comparator 。ルールに従って比較して最大のものを取得する。
        Stream<String> stream1 = Stream.of("hoge", "pk", "koko");
        Optional<String> result1 = stream1.collect(Collectors.maxBy(Comparator.naturalOrder()));
        System.out.println(result1.get());

        // minBy() メソッドの例。
        // 引数は Comparator 。ルールに従って比較して最小のものを取得する。
        Stream<String> stream2 = Stream.of("hoge", "pk", "koko");
        Optional<String> result2 = stream2.collect(Collectors.minBy(Comparator.naturalOrder()));
        System.out.println(result2.get());

        // groupingBy() と maxBy() の複合例題。
        // まず groupingBy() で Stream の要素をグルーピング。
        // その結果の Map<String, List<String>> の List<String> から maxBy() で最大値を取得。
        // 結果は、各 key に対する最大の文字列が value に設定された Map 。
        Stream<String> stream3 = Stream.of("101", "105", "106", "203", "205");
        Map<String, Optional<String>> result3 = stream3.collect(Collectors.groupingBy(
            s -> s.substring(0, 1),
            Collectors.maxBy(Comparator.naturalOrder())
        ));
        System.out.println(result3);
    }
}
