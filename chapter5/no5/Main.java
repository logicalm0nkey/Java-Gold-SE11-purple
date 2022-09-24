package chapter5.no5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hoge", "Piyo");

        // ラムダ式。一番簡素な書き方。
        words.replaceAll(str -> str.toUpperCase());
        // ラムダ式。引数のを宣言。ロジックもブロックで囲ってる。
        // words.replaceAll((String str) -> {return str.toUpperCase();});
        // ラムダ式。引数で型推論を使用。
        // words.replaceAll((var str) -> {return str.toUpperCase();});

        System.out.println(words);
    }
}
