package Rechapter6.no9;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("c", "a");

        // findFirst メソッドは、 Stream の最初の要素を返す
        Optional<String> result1 = list.stream().findFirst();
        // findAny メソッドは、 Stream のいずれかの要素を返す
        Optional<String> result2 = list.stream().findAny();

        System.out.println("result1: " + result1.get());
        System.out.println("result2: " + result2.get());

        Stream<String> stream = Stream.empty();
        Optional<String> result3 = stream.findFirst();
        // これは実行時エラーとなる。空の Stream から findFirst などを行うと空の Optional が返されるため。
        // java.util.NoSuchElementException
        // System.out.println("result3: " + result3.get());
        result3.ifPresent(System.out::println);

        IntStream intStream = IntStream.of(10, 20, 30);
        OptionalInt result4 = intStream.findFirst();
        // OptionalInt クラスには get メソッドはないためコンパイルエラー。 getAsInt メソッドを使う。
        // System.out.println("result4: " + result4.get());
        System.out.println("result4: " + result4.getAsInt());
    }
}
