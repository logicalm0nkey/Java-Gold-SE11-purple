package Rechapter6.no5;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Integer> operator = (a, b) -> a + b;
        Stream<Integer> stream1 = Stream.of(10, 20, 30);
        // 集約処理の結果を持つ Optional クラスを返す reduce
        Optional<Integer> result = stream1.reduce(operator);
        // Optional オブジェクトが値を持っていたら引数の Consumer を実行する
        result.ifPresent(System.out::println);
        
        // 要素が無い空の Steam
        Stream<Integer> stream2 = Stream.empty();
        // 空の Stream を集約（当然結果はない）
        Optional<Integer> result2 = stream2.reduce(operator);
        System.out.println(result2);
        // 要素が無いので何も行われない
        result2.ifPresent(System.out::println);
    }
}
