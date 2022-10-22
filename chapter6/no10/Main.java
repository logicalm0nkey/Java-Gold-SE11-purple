package chapter6.no10;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("aa", "bbbb", "c");

        // data をデータソースに持つ Stream から最初の要素を取得する
        Optional<String> result1 = data.stream().findFirst();

        // data をデータソースに持つ Stream からいずれかの要素を取得する
        // なぜか常に findFirst() と同じ結果しか返ってこないが…？
        // シングルスレッドで Stream を線型に扱うときは findFirst() と結果が変わらないらしい。
        // マルチスレッドで本領発揮らしい。
        Optional<String> result2 = data.stream().findAny();

        System.out.println(result1.get());
        System.out.println(result2.get());

        // 空の Stream を作成
        Stream<String> stream = Stream.empty();
        // 空の Stream からは何も取りださない。コンパイルは通るし、実行時エラーも出ない。
        Optional<String> result3 = stream.findFirst();
        result3.ifPresent(r -> System.out.println("empty: " + r));

        IntStream intsStream = IntStream.of(10, 20);
        OptionalInt result4 = intsStream.findFirst();
        System.out.println(result4.getAsInt());
    }
}
