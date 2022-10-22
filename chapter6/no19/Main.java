package chapter6.no19;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // IntStream -> DoubleStream という変換を asDoubleStream() メソッドを使用して実行
        IntStream stream1i = IntStream.of(1, 2, 3);
        DoubleStream stream1d = stream1i.asDoubleStream();
        // 平均値を出力。平均値は average() メソッドで得られる。戻り値は OptionalDouble なので、 getAdDouble() で取り出す。
        System.out.println(stream1d.average().getAsDouble());

        // IntStream -> DoubleStream という変換を mapToDouble() メソッドを使用して実行
        IntStream stream2i = IntStream.of(1, 2, 3);
        DoubleStream stream2d = stream2i.mapToDouble(n -> n);
        System.out.println(stream2d.average().getAsDouble());
    }
}
