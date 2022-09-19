package chapter4.no12;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("1111", "AAA");
        map.put("2222", "BBB");
        map.put("3333", "CCC");
        map.put("4444", "DDD");

        // var key = "2000";
        var key = "1000";

        if (map.containsKey(key)) {
            System.out.println("get(): " + map.get(key));
        } else {
            // 指定されたキーより真に大きい中で一番小さいキーを返す。そのようなキーが無い場合は null を返す。
            System.out.println("higherKey(): " + map.higherKey(key));
            // 指定されたキーより真に小さい中で一番大きいキーを返す。そのようなキーが無い場合は null を返す。
            System.out.println("lowerKey(): " + map.lowerKey(key));
        }

        // subMap() メソッドは、 NavigableMap オブジェクトのサブマップを返す。写像の制限、みたいな感じ。
        // fromKey から toKey の間のキーを持つ要素を全て返す。
        // fromInclusive = true だと fromKey を含む。 fromInclusive = false だと含まない。
        // toInclusive = true だと toKey を含む。 toInclusive = false だと toKey を含まない。
        NavigableMap<String, String> subMap = map.subMap("2000", true, "3500", true);

        System.out.println("2000 - 3500: " + subMap);

        // fromKey > toKey だと IllegalArgumentException が発生する。コンパイルは通る。実行時エラー。
        // subMap = map.subMap("3500", true, "2000", true);
    }
}
