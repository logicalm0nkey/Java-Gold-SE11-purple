package Rechapter4.no11;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "A");
        map.put(1, "B");
        // key = 0 と value が重複（OK）
        map.put(2, "A");
        // key = 1 が重複。エラーにはならず value が上書きされる。
        map.put(1, "C");

        // key = 2 を含むか判定（含んでるので true）
        System.out.println(map.containsKey(2));
        // value = X を含むか判定（含んでいないので false）
        System.out.println(map.containsValue("X"));

        for (int i = 0; i < map.size(); i++) {
            System.out.print(map.get(i) + " ");
        }
    }
}
