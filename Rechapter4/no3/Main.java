package Rechapter4.no3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Integer i1 = 1;
        int i2 = 2;
        Integer i3 = i1;

        // ただの追加
        list.add(i1);
        // オートボクシングを利用した追加
        list.add(i2);
        // 参照先が同じ変数の追加、即ち値が重複した要素の追加
        list.add(i3);
        // index = 1 に element = 5 を追加
        // 追加後、元々そのインデックスにあった要素は後ろにずれる
        list.add(1, 5);

        // 要素数は size()
        System.out.println("size: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            // データの取得は get(index)
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        // Integer 型は拡張 for 文で値をそのまま表示可能
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
