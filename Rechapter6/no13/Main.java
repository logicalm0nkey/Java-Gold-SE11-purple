package Rechapter6.no13;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Stream 生成
        Stream<String> stream1a = Stream.of("naoki", "akko", "ami");
        // 全部大文字に変換
        Stream<String> stream1b = stream1a.map(s -> s.toUpperCase());
        stream1b.forEach(x -> System.out.print(x + " "));
        System.out.println();

        // Stream 生成
        Stream<String> stream2a = Stream.of("naoki", "akko", "ami");
        // 文字列の長さからなる Integer 型の Stream を生成
        Stream<Integer> stream2b = stream2a.map(s -> s.length());
        stream2b.forEach(x -> System.out.print(x + " "));
        System.out.println();

        IntStream stream3a = IntStream.of(1, 2, 3);
        // 10倍する
        IntStream stream3b = stream3a.map(n -> n * 10);
        stream3b.forEach(x -> System.out.print(x + " "));
    }
}
