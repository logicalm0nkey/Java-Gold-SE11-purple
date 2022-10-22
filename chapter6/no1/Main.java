package chapter6.no1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // データソース
        List<String> list1 = Arrays.asList("bb", "aa", "cc");

        // データソース -> 大文字に変換 -> 昇順にソート -> 出力 というストリームを実装
        // 大文字に変換
        for (var i = 0; i < list1.size(); i++) {
            var s = list1.get(i).toUpperCase();
            list1.set(i, s);
        }
        // 昇順にソート
        Collections.sort(list1);
        // 出力
        System.out.println(list1);

        // データソース
        List<String> list2 = Arrays.asList("bb", "aa", "cc");

        // stream API を使った実装
        list2.stream().sorted().map(s -> s.toUpperCase()).forEach(System.out::println);
    }
}
