package Rechapter6.no4;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Integer 型の Stream
        Stream<Integer> stream = Stream.of(10, 20, 30);
        // 集約処理。 reduce() メソッドの第1引数は集約の初期値。第2引数は BinaryOperator
        // 0 + 10 -> 10 + 20 -> ... という感じ
        Integer result = stream.reduce(0, (a, b) -> a + b);
        System.out.println(result);

        Stream<Integer> stream2 = Stream.of(10, 20, 30);
        // Integer.sum も使える。引数とかの関係でメソッド参照の書き方ができる。
        int result2 = stream2.reduce(0, Integer::sum);
        System.out.println(result2);
    }
}
