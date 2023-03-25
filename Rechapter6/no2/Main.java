package Rechapter6.no2;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // データソース
        List<String> list = Arrays.asList("mana", "naoki", "ryo");

        // 全ての要素が長さ3以上か (∀x(x < list -> P(x)))
        boolean result1 = list.stream().allMatch(s -> s.length() >= 3);
        // 長さが4の要素が存在するか (∃x(x < list & P(x)))
        boolean result2 = list.stream().anyMatch(s -> s.length() == 4);
        // 全ての要素が長さ4でないか (anyMatch の否定)
        boolean result3 = list.stream().noneMatch(s -> s.length() == 4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        // 以下のコードは実行時エラーとなる。1つの Stream オブジェクトに対し、実行できる終端操作は1つだけ。
        // 終端操作を実行するために Stream オブジェクトを使いまわすことはできない。
        // Stream<String> stream = list.stream();
        // boolean result4 = stream.allMatch(s -> s.length() == 3);
        // boolean result5 = stream.allMatch(s -> s.length() == 3);
    }
}
