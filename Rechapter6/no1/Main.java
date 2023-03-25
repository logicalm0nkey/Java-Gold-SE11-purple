package Rechapter6.no1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 文字列のコレクションを、大文字に変換して、昇順にソートして、出力する。
        List<String> list = Arrays.asList("bb", "cc", "aa");

        // 実装例1: for 文を使った実装
        for (int i = 0; i < list.size(); i++) {
            // 大文字に変換
            String s = list.get(i).toUpperCase();
            list.set(i, s);
        }

        // 昇順にソート
        Collections.sort(list);

        // 出力
        for (String s : list) {
            System.out.print(s + " ");
        }

        System.out.println();

        // 実装例2: Stream API を使った実装例
        list.stream()
                // 昇順にソート
                .sorted()
                // 大文字に変換
                .map(s -> s.toUpperCase())
                // 出力
                .forEach(s -> System.out.print(s + " "));
    }
}
