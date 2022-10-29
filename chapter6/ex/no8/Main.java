package chapter6.ex.no8;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(1, 2, 3);
        // IntStream インターフェースの sum() メソッドは、戻り値が int。
        int sum = stream1.sum();

        IntStream stream2 = IntStream.of(1, 2, 3);
        // IntStream インターフェースの findAny() メソッドは戻り値が OptionalInt。
        OptionalInt r = stream2.findAny();

        IntStream stream3 = IntStream.of(1, 2, 3);
        // IntStream インターフェースの average() メソッドは戻り値が OptionalDouble。
        OptionalDouble r2 = stream3.average();
    }
}
