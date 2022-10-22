package chapter6.no9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("aa", "bbbb", "c");

        // String 型の List から、自然な順序で比較したときの最大値を取得する。
        Optional<String> result1 = data.stream().max(Comparator.naturalOrder());

        // String 型の List から、文字列長が最大のものを取得する
        Optional<String> result2 = data.stream().max((d1, d2) -> d1.length() - d2.length());

        result1.ifPresent(System.out::println);
        result2.ifPresent(System.out::println);
    }
}
