package chapter4.no24;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] ary = {"b", "a", "C"};
        List<String> list = Arrays.asList(ary);
        // Arrays.asList() を使って作られたリストは、要素の置き換えは可能。追加と削除ができない。
        // つまり、要素数の変更ができない。
        list.set(2, "d");
        System.out.println(list);
    }
}
