package Rechapter6.no17;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream1o = Stream.of("a", "b");
        Stream<Integer> stream1n = stream1o.map(s -> s.length());

        Stream<String> stream2o = Stream.of("naoki", "akko", "ami");
        IntStream stream2n = stream2o.mapToInt(s -> s.length());

        Stream<Integer> stream3o = Stream.of(1, 2, 3);
        IntStream stream3n = stream3o.mapToInt(n -> n);

        Stream<Integer> stream4o = Stream.of(1, 2, 3);
        Stream<String> stream4n = stream4o.map(n -> n + "a");

        IntStream stream5o = IntStream.of(1, 2, 3);
        Stream<String> stream5n = stream5o.mapToObj(n -> n + "a");

        IntStream stream6o = IntStream.of(1, 2, 3);
        Stream<Integer> stream6n = stream6o.boxed();
    }
}
