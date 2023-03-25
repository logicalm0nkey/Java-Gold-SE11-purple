package Rechapter6.no18;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // IntStream -> DoubleStream という変換を mapToDouble を使って実現
        IntStream stream1i = IntStream.of(3, 2, 3);
        DoubleStream stream1d = stream1i.mapToDouble(i -> i);
        // DoubleStream.average() の戻り値は OptionalDouble
        System.out.println(stream1d.average().getAsDouble());

        // IntStream -> DoubleStream という変換を asDoubleStream を使って実現
        IntStream stream2i = IntStream.of(3, 2, 3);
        DoubleStream stream2d = stream2i.asDoubleStream();
        System.out.println(stream2d.average().getAsDouble());
    }
}
