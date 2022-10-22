package chapter6.no4;

import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // Stream オブジェクトの count() メソッドは戻り値の型が long
        long result1 = Stream.of(1, 2, 3).count();
        System.out.println(result1);

        // forEach メソッド
        Stream<String> stream = Stream.of("null", "po", "GA!");
        stream.forEach(System.out::println);
    }
}
