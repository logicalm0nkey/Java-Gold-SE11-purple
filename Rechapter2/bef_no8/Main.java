package Rechapter2.bef_no8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList<Integer>();
        // ここで警告が出る。型が安全じゃないぞって警告。
        List<String> s_l = list;

        // 以下は実行時に ClassCastException が発生するコード
        // list.add(100);  // これだけだとエラーは発生しない
        // String s = s_l.get(0);  // ここで ClassCastException が発生する。

        m(new ArrayList<String>());
    }

    // 非推奨な書き方らしいので覚える必要なし。
    // 資格用に頭に入れておけばよい。
    // 大事なのは、「generics を使用している型の配列は非推奨だぞ」ってこと。
    static void m(List<String>... lists) {
        Object[] array = lists;
        List<Integer> i_l = Arrays.asList(10);
        array[0] = i_l;
        // ここで ClassCastException が発生。
        String s = lists[0].get(0);
    }
}
