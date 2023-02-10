package Rechapter4.ex11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, ? extends Number> col1 = new HashMap<String, Integer>();
        // <> の中の型が継承関係にあっても、直接型だけを書いているときは同じ型を書かないとコンパイルエラー
        HashSet<Number> col2 = new HashSet<Long>();
        HashSet<? super IllegalArgumentException> col3 = new HashSet<Exception>();
    }
}
