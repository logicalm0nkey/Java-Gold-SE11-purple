package chapter6.ex.no3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);

        // Map インターフェースの merge() メソッドの使用例。
        // シグネチャは merge(key, value, BiFunction) 。
        // key が存在したら、その key に対応する Map オブジェクトの値と、引数の value を BiFunction に渡して処理する。
        // 処理の結果を key の値として設定する。
        // key が存在しなかったら、 map.put(key, value) 相当の処理をする。
        // 元々存在している key に value をマージする、という感じ。
        // 今回は、 key = 1 が存在するので、 10 + 3 が実行される。
        // key = 3 も存在するので 30 + 3 も実行される。
        map.merge(1, 3, (a, b) -> a + b);
        map.merge(3, 3, (a, b) -> a + b);

        // こうすると key = 4, value = 40 の項目が追加される。
        map.merge(4, 40, (a, b) -> a + b);

        // 結果は {1=13, 2=20, 3=33, 4=40}
        System.out.println(map);
    }
}
