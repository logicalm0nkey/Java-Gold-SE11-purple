package Rechapter6.no11;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("ami", "naoki", "akko");
        // a から始まる文字列でフィルタ
        stream1.filter(x -> x.startsWith("a")).forEach(s -> System.out.print(s + " "));
        System.out.println();

        Stream<String> stream2 = Stream.of("", "naoki", "akko");
        // 空文字以外を出力
        stream2.filter(Predicate.not(s -> s.isEmpty())).forEach(s -> System.out.print(s + " "));
        System.out.println();

        // ami が重複してる
        Stream<String> stream3 = Stream.of("ami", "naoki", "akko", "ami");
        // 重複を省く
        stream3.distinct().forEach(s -> System.out.print(s + " "));
    }
}
