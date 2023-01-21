package Rechapter4.no12;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("1111", "A");
        map.put("2222", "B");
        map.put("3333", "C");
        map.put("4444", "D");

        String key = "2000";

        if (map.containsKey(key)) {
            // 指定されたキーを含んでいたら、そのオブジェクトを表示
            System.out.println("get(): " + map.get(key));
        } else {
            // 含んでいない場合

            // key より大きいキーのうち最小のものを取得（該当するものが無かったら null）
            System.out.println("higherKey(): " + map.higherKey(key));
            // key より小さいキーのうち最大のものを取得（該当するものが無かったら null）
            System.out.println("lowerKey(): " + map.lowerKey(key));
        }

        // キーの範囲を指定してサブマップを取得する。
        // 今回は 2000 <= key <= 3500 で検索してる。
        NavigableMap<String, String> subMap = map.subMap("2000", true, "3500", true);
        System.out.println("2000 - 3500: " + subMap);
    }
}
