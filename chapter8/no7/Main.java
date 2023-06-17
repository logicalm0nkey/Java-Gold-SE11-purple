package chapter8.no7;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,  "tanaka");
        map.put(2,  "urai");

        // map.remove(1);
        // map.remove(2);

        // 拡張 for 文の実行中に要素数？が変更されると実行時例外が発生する
        for (Integer key : map.keySet()) {
            map.remove(key);
        }
    }
}
