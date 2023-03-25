package Rechapter6.no26;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("naoki", "akko", "ami");
        // map() メソッドを使った例
        // stream -> map() で stream へ -> collect() で結果取得
        String result1 = stream1.map(s -> s.toUpperCase()).collect(Collectors.joining(" : "));
        System.out.println(result1);

        Stream<String> stream2 = Stream.of("naoki", "akko", "ami");
        // mapping() メソッドを使った例
        // stream -> mapper で stream に変換 -> downStream で結果を取得
        String result2 = stream2.collect(Collectors.mapping(
                s -> s.toUpperCase(),
                Collectors.joining(" : ")));
        System.out.println(result2);

        // map() -> collect() を一気にかける構文という位置づけか
    }
}
