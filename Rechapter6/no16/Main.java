package Rechapter6.no16;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = Stream.of("one", "three", "two", "three", "four")
                .filter(s -> s.length() > 3)
                // peek() の引数は Consumer 。デバッグ用に使うメソッド。
                .peek(s -> System.out.println("After filter(): " + s))
                .distinct()
                .peek(s -> System.out.println("After distinct(): " + s))
                .map(String::toUpperCase)
                .peek(s -> System.out.println("After map(): " + s))
                .collect(Collectors.toList());
    }
}
