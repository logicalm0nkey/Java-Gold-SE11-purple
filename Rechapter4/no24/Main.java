package Rechapter4.no24;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] ary = {"A", "B", "C"};
        List<String> list = Arrays.asList(ary);

        // Arrays.asList で作られたリストは要素数が固定なので、要素の追加と削除は行えない
        // 実行時エラーが発生する。コンパイルは通る。
        // list.add("D");
        // 要素の変更は可能。
        list.set(2, "D");

        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
