package Rechapter4.no23;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = { 3, 1, 2 };
        // インデックス順での表示
        print(array1);

        System.out.println();

        // array1 を自然順序昇順にソート
        Arrays.sort(array1);
        print(array1);

        System.out.println();

        Object[] array2 = { "a", 1 };
        // 配列の要素の型が統一されていないと、実行時に ClassCastException が発生する
        // Arrays.sort(array2);
    }

    static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
