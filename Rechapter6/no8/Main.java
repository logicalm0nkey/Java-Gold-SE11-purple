package Rechapter6.no8;

import java.util.Optional;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa", "bb", "c");

        // 文字列に対する自然順序で最大のものを取得
        Optional<String> result1 = list.stream().max(Comparator.naturalOrder());
        // 文字数が最も多いものを取得
        Optional<String> result2 = list.stream().max((s1, s2) -> s1.length() - s2.length());

        result1.ifPresent(System.out::println);
        result2.ifPresent(System.out::println);
    }
}
