package Rechapter6.no22;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("nao", "akko", "ami");
        // mergeFunction を引数に書いた toMap()
        // key が重複していた時の value のマージ方法を定義する
        // 今回なら、 key が重複していた場合、2つの value (s1, s2) を " : " で連結する。
        Map<Integer, String> map1 = stream1.collect(Collectors.toMap(
                String::length,
                s -> s,
                (s1, s2) -> s1 + ", " + s2));
        System.out.println(map1);
        System.out.println(map1.getClass());

        Stream<String> stream2 = Stream.of("nao", "akko", "ami");
        // 上と同じマージをした後、結果を別の Map オブジェクトに格納する
        // 今回は、結果を TreeMap (自然に順序付けられた Map) に格納する
        Map<Integer, String> map2 = stream2.collect(Collectors.toMap(
                String::length,
                s -> s,
                (s1, s2) -> s1 + ", " + s2,
                TreeMap::new));
        System.out.println(map2);
        System.out.println(map2.getClass());
    }
}
