package chapter4.no25;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // List.of() は重複した値もOK
        List<Integer> list = List.of(1, 2, 1);
        System.out.println("List.of(): " + list);

        // null は格納できない。実行時エラー。
        // 構文的には間違っていないためコンパイルは通る。
        // List<Integer> list2 = List.of(1, 2, null);

        // Set.of() は重複した値はダメ。
        Set<Integer> set = Set.of(1, 2, 3);
        System.out.println("Set.of(): " + set);

        // これは実行時エラー。コンパイルは通る。
        // 通常の Set.add() は勝手に重複した要素を削除してくれるが、 of() メソッドはダメらしい。
        // Set<Integer> set2 = Set.of(1, 2, 1);

        // null の格納もできない。実行時エラー。
        // 内部で Object.hashCode() を使ってるらしい。そこでぬるぽが発生する。実態は HashSet かな？
        // Set<Integer> set3 = Set.of(1, 2, null);

        // Map.of() は重複したキーはダメ。要素は↓のように書き並べる。見づらい…。
        // 改行すれば多少マシ？
        Map<Integer, String> map = Map.of(
                1, "a",
                2, "b",
                3, "c");
        System.out.println("Map.of(): " + map);

        // これは実行時エラー。キーが重複してる。
        // Map<Integer, String> map2 = Map.of(1, "a", 1, "b");

        // null は、キーにも値にも設定できない。実行時エラー。
        // Map<Integer, String> map3 = Map.of(null, "a");
        // Map<Integer, String> map4 = Map.of(1, null);

        
    }
}
