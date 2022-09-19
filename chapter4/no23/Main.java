package chapter4.no23;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ary = { 3, 1, 2 };
        print(ary);

        // 破壊的操作。配列そのものが変わる。
        Arrays.sort(ary);
        print(ary);

        // Object 型の配列に異なる型の要素を突っ込んで sort してもコンパイルは通る。
        // 実行時に ClassCastException が発生する。
        Object[] objs = { "a", 1 };
        // Arrays.sort(objs);
    }

    static void print(int[] ary) {
        for (int i : ary) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
