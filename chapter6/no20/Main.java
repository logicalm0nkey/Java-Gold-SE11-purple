package chapter6.no20;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Collectors.toList() メソッドを使って Stream の要素を List<String> に変換するコード。
        // Stream インターフェースの collect メソッドは終端操作。
        // Stream の要素 -> collect (中で Collector オブジェクトを利用) -> List<String> という感じか。
        Stream<String> stream1 = Stream.of("hoge", "pk", "kokoko");
        List<String> result1 = stream1.collect(Collectors.toList());
        System.out.println(result1);

        // Collectors.joining() メソッドを使って Stream の要素を String に変換するコード。
        // Stream の要素を文字列として連結するのが joining() 。引数は区切り文字として使われる。
        Stream<String> stream2 = Stream.of("hoge", "pk", "kokoko");
        String result2 = stream2.collect(Collectors.joining(" | "));
        System.out.println(result2);

        // 引数無しでも joining() は使える。引数が無いとそのまま連結した文字列が表示される。
        Stream<String> stream2_2 = Stream.of("hoge", "pk", "kokoko");
        String result2_2 = stream2_2.collect(Collectors.joining());
        System.out.println(result2_2);

        // Collectors.summingInt() メソッドを使って Stream の要素に int 値関数を適用して int に変換するコード。
        Stream<String> stream3 = Stream.of("hoge", "pk", "kokoko");
        Integer result3 = stream3.collect(Collectors.summingInt(s -> s.length()));
        System.out.println(result3);

        // Collectors.averagingInt() メソッドを使って Stream の要素に int 値関数を適用して double に変換するコード。
        // 相加平均を取得するので、戻り値は double になる。
        Stream<String> stream4 = Stream.of("hoge", "pk", "kokoko");
        Double result4 = stream4.collect(Collectors.averagingInt(s -> s.length()));
        System.out.println(result4);
    }
}
