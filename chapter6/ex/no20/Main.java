package chapter6.ex.no20;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // 問題文のコード
        List<Integer> list = IntStream.range(10, 15)
                .mapToObj(i -> i).collect(Collectors.toList());
        list.forEach(System.out::println);

        // 正解のコード
        IntStream.range(10, 15).forEach(System.out::println);
    }
}
