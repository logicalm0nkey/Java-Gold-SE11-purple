package chapter6.no11;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 空の Stream
        Stream<Double> stream = Stream.empty();

        // 空の Optinal を生成。
        Optional<Double> optional = stream.findAny();

        // Optional が空のとき、 orElse で指定した値を返す。
        System.out.println(optional.orElse(0.0));

        // Optional が空のとき、 orElseGet で指定した Supplier の結果を返す。
        System.out.println(optional.orElseGet(() -> Math.random()));
        // これはコンパイルエラー。 orElseGet() の引数の Supplier の戻り値は、元になっている Optional の型と一致していないといけないため。
        // 今回なら Double を返さないといけない。
        //System.out.println(optional.orElseGet(() -> new IllegalArgumentException()));

        // Optional が空のとき、 orElseThrow で指定した例外を発生させる。
        System.out.println(optional.orElseThrow(IllegalArgumentException::new));
    }
}
