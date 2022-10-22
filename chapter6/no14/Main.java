package chapter6.no14;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Stream<String> -> Stream<String> の変換。
        // 文字列からなる Stream を作成
        Stream<String> stream1 = Stream.of("hoge", "fuga", "poko");
        // 各文字列を大文字に変換した Stream に変換。
        Stream<String> stream1_b = stream1.map(s -> s.toUpperCase());
        stream1_b.forEach(s -> System.out.print(s + " "));
        System.out.println();

        // Stream<String> -> Stream<Integer> の変換。
        // 文字列からなる Stream を作成
        Stream<String> stream2 = Stream.of("hoge", "fuga", "poko");
        // 各文字列の長さを持つ Stream に変換
        Stream<Integer> stream2_b = stream2.map(s -> s.length());
        stream2_b.forEach(s -> System.out.print(s + " "));
        System.out.println();

        // IntStream -> IntStream の変換。
        // IntStream を作成
        IntStream intStream = IntStream.of(1, 2, 3);
        // 各要素を10倍した IntStream に変換
        IntStream intStream_b = intStream.map(i -> i * 10);
        intStream_b.forEach(s -> System.out.print(s + " "));
    }
}
