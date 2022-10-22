package chapter6.no3;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("mana", "kana", "pak");

        // 終端操作の例。

        // 全ての要素 x に対し、 x が条件を満たしたら true (∀x(P(x) -> true)) 。よってデータソースが空でも true 。
        boolean result1 = data.stream().allMatch(s -> s.length() >= 3);
        // 条件を満たす要素が存在したら true (∃x(P(x) -> true))
        boolean result2 = data.stream().anyMatch(s -> s.length() >= 3);
        // 全ての要素 x に対し、 x が条件を満たさなかったら true （∀x(￢P(x) -> true)）。よってデータソースが空でも true 。
        boolean result3 = data.stream().noneMatch(s -> s.length() == 4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        // 以下は実行時エラー。コンパイルは通る。
        // 任意の Stream オブジェクトに対して、終端操作 (Stream オブジェクトを返さないメソッド) は1回のみ実行可能。
        // Stream<String> stream = data.stream();
        // boolean result4 = stream.allMatch(s -> s.length() == 0);
        // boolean result5 = stream.anyMatch(s -> s.length() == 0);
    }
}
