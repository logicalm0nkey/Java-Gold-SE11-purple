package chapter6.no6;

import java.util.stream.*;
import java.util.Optional;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Integer> operator = (a, b) -> a + b;

        Stream<Integer> stream1 = Stream.of(10, 20, 30);
        // 初期値を設定しない reduce() メソッド。
        // 戻り値は Optional<Integer> 。 Optional<Integer> の実態は、 Integer 型の値を1個だけ持つクラスらしい。
        // 一般に Oprional 型が値を1個だけ持つクラスらしい。
        Optional<Integer> result1 = stream1.reduce(operator);
        // Optional[60] と出力される。持ってる値が一緒に表示される。
        System.out.println(result1);
        // 結果の出力 (60)
        result1.ifPresent(System.out::println);

        // これはコンパイルエラー。戻り値は Integer じゃないから。コンパイルを通したかったら上の通り書くか、
        // reduce() メソッドで初期値を設定する。
        // int r = stream1.reduce(operator);

        // 空の Stream 作成。データが空っぽ。
        Stream<Integer> stream2 = Stream.empty();
        // 空の Stream に対しても reduce() メソッドが使える。コンパイル、実行、共に成功。
        Optional<Integer> result2 = stream2.reduce(operator);
        // Optional.empty と出力される。
        System.out.println(result2);
        // 出力データなし。
        result2.ifPresent(System.out::println);
    }
}
