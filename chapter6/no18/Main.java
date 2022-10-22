package chapter6.no18;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Stream<String> -> Stream<Integer> は map()
        Stream<String> stream1o = Stream.of("a", "b");
        Stream<Integer> stream1n = stream1o.map(s -> s.length());
        stream1n.forEach(x -> System.out.print(x + " "));
        System.out.println();

        // Stream<String> -> IntStream は mapToInt()
        Stream<String> stream2o = Stream.of("hoge", "pok", "gg");
        IntStream stream2n = stream2o.mapToInt(s -> s.length());
        stream2n.forEach(x -> System.out.print(x + " "));
        System.out.println();

        Stream<Integer> stream3o = Stream.of(1, 2, 3);
        IntStream stream3n = stream3o.mapToInt(n -> n);
        stream3n.forEach(x -> System.out.print(x + " "));
        System.out.println();

        Stream<Integer> stream4o = Stream.of(1, 2, 3);
        Stream<String> stream4n = stream4o.map(n -> n + "a");
        stream4n.forEach(x -> System.out.print(x + " "));
        System.out.println();

        IntStream stream5o = IntStream.of(1, 2, 3);
        Stream<String> stream5n = stream5o.mapToObj(n -> n + "a");
        stream5n.forEach(x -> System.out.print(x + " "));
        System.out.println();

        IntStream stream6o = IntStream.of(1, 2, 3);
        Stream<Integer> stream6n = stream6o.boxed();
        stream6n.forEach(x -> System.out.print(x + " "));
        System.out.println();

        int a = 0;
        String s = "a";
        String ss = a + s;
        System.out.println(ss);
    }
}
