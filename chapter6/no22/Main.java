package chapter6.no22;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // toMap(Function, Function) の例1
        // 変換先は Map なので、 value は被っていても問題ない（hoge と koko の文字数が被ってる）
        Stream<String> stream1 = Stream.of("hoge", "pk", "koko");
        Map<String, Integer> map1 = stream1.collect(Collectors.toMap(s -> s, s -> s.length()));
        System.out.println(map1);

        // toMap(Function, Function) の例2
        // 変換先は Map なので、 key が被ってると実行時エラーとなる（hoge と koko の文字数が被ってる）
        // 構文的には問題ないのでコンパイルは通る。実行時エラー。
        Stream<String> stream2 = Stream.of("hoge", "pk", "koko");
        Map<Integer, String> map2 = stream2.collect(Collectors.toMap(s -> s.length(), s -> s));
        System.out.println(map2);
    }
}
