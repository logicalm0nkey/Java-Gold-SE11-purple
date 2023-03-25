package Rechapter6.no24;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("belle", "akko", "ami", "bob", "nao");
        // Collectors.groupingBy の別構文
        // stream -> 別のオブジェクトに変換 -> 別のオブジェクトを value にもつ Map を作成
        // という感じ
        Map<String, Set<String>> map1 = stream1.collect(Collectors.groupingBy(
            s -> s.substring(0, 1),
            Collectors.toSet())
        );
        System.out.println(map1);

        Stream<String> stream2 = Stream.of("belle", "akko", "ami", "bob", "nao");
        // この例では stream -> String (joining) -> Map と変換している
        Map<String, String> map2 = stream2.collect(Collectors.groupingBy(
            s -> s.substring(0, 1),
            Collectors.joining(" : ")
        ));
        System.out.println(map2);
        // ちなみに HashMap
        System.out.println("stream -> 別クラス -> Map の groupingBy(): " + map2.getClass());

        Stream<String> stream3 = Stream.of("belle", "akko", "ami", "bob", "nao");
        // stream -> 別オブジェクトへ変換 (String) -> TreeMap として返す
        // という感じ
        Map<String, String> map3 = stream3.collect(Collectors.groupingBy(
            s -> s.substring(0, 1),
            TreeMap::new,
            Collectors.joining(" : ")
        ));
        System.out.println(map3);
        System.out.println("stream -> 別クラス -> TreeMap の groupingBy(): " + map3.getClass());
    }
}
