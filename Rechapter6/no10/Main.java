package Rechapter6.no10;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stream<Double> stream = Stream.empty();

        Optional<Double> optional = stream.findAny();
        // 実行時エラー
        // System.out.println(optional.get());

        // orElse メソッドはリテラルを指定してそれを返す。リテラルの型は Optional の要素の型と一致させる。
        System.out.println(optional.orElse(0.0));
        // orElseGet メソッドは Supplier を指定して、その結果を返す。 Supplier の戻り値の型は Optional の要素の型と一致させる。
        System.out.println(optional.orElseGet(() -> Math.random()));
        // orElseThrow メソッドは例外を指定して、その例外オブジェクトを返す。
        System.out.println(optional.orElseThrow(IllegalStateException::new));
    }
}
