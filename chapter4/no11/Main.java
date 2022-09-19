package chapter4.no11;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(0, "AAA");
        map.put(1, "BBB");
        // 値の重複（key 0 と）
        map.put(2, "AAA");
        // キーの重複。重複したキーを指定すると、後から指定した値に置き換わる。
        map.put(1, "CCC");

        // キーの存在確認を行うメソッド
        System.out.println(map.containsKey(2));
        System.out.println(map.containsKey(5));
        // 値の存在確認を行うメソッド
        System.out.println(map.containsValue("XXX"));
        System.out.println(map.containsValue("AAA"));

        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get(i));
        }
    }
}
