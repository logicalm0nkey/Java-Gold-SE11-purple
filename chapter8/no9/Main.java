package chapter8.no9;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "hoge");
        map.put(2, "fuga");

        // ConcurrentHashMap を使うと、拡張 for 文の中で remove() を実行しても要素が削除される
        for (Integer key : map.keySet()) {
            System.out.println(map.size());
            map.remove(key);
        }

        System.out.println(map.size());
    }
}
