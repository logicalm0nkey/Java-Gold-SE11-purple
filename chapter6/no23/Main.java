package chapter6.no23;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // toMap(Function, Function, BinaryOperator) の例。
        // toMap の結果の Map で key が被ったときに BinaryOperator を利用して value をマージする。
        // 今回なら key が被ってる文字列を「&」で連結する。
        Stream<String> stream1 = Stream.of("hoge", "pk", "koko");
        Map<Integer, String> map1 = stream1.collect(Collectors.toMap(
                String::length,
                s -> s,
                (s1, s2) -> s1 + " & " + s2));
        System.out.println(map1);
        System.out.println(map1.getClass());

        // toMap(Function, Function, BinaryOperator, Supplier) の例。
        // 上の例と同じく、変換先の Map の key が被ってたら BinaryOperator で value をマージする。
        // こちらは、マージした結果を Supplier で指定された別の Map に格納する。今回なら new した TreeMap に格納する。
        Stream<String> stream2 = Stream.of("hoge", "pk", "koko");
        Map<Integer, String> map2 = stream2.collect(Collectors.toMap(
                String::length,
                s -> s,
                (s1, s2) -> s1 + " & " + s2,
                TreeMap::new));
        System.out.println(map2);
        System.out.println(map2.getClass());
    }
}
