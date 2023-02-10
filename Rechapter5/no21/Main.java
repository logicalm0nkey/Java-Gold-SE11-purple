package Rechapter5.no21;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Function<String, Character> f1 = s -> s.charAt(0);
        Function<Character, Boolean> f2 = c -> Character.isUpperCase(c);
        // andThen メソッドの利用 (f1 -> f2 の順番。即ち オブジェクト -> 引数 の順番。)
        Function<String, Boolean> f3 = f1.andThen(f2);
        System.out.println(f3.apply("Hoge"));
        // こんな書き方もできますよ
        System.out.println(f1.andThen(f2).apply("fuga"));

        // compose メソッドの利用 (f1 -> f2 の順番。即ち 引数 -> オブジェクト の順番。)
        Function<String, Boolean> f4 = f2.compose(f1);
        System.out.println(f4.apply("Hoge"));
    }
}
