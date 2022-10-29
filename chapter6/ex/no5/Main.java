package chapter6.ex.no5;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // String もしくはそのスーパークラスに対しての Predicate
        Predicate<? super String> predicate = s -> s.length() < 5;
        // Stream.generate() メソッドで Stream を生成。
        // Stream.generate() メソッドは、引数の Supplier の結果を無限に生成する（要素を無限に生成する）。
        // よって、実際に使う際は limit() メソッドで要素数に制限を設ける必要がある。
        Stream<String> stream = Stream.generate(() -> "orange");
        // anyMatch() メソッドで、引数の Predicate を満たす要素が存在するかチェック。
        // 今回は stream の全ての要素（無限個の "orange"）が predicate を満たさないのでハングする。
        System.out.println(stream.anyMatch(predicate));

        // なお、構文的には間違っていないのでコンパイルは通る。
        // また、実行時エラーも（ハング以外）発生しない。
        // ハングした際の解除方法はターミナルで Ctrl + C
    }
}
