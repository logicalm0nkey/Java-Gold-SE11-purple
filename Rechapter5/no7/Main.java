package Rechapter5.no7;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // 匿名クラスを利用した例
        String str1 = new Function<String, String>() {
            public String apply(String str) {
                return "Hello " + str;
            }
        }.apply("World!");
        System.out.println("匿名クラス: " + str1);

        // ラムダ式（省略な無し）
        Function<String, String> f1 = (String str) -> {
            return "Hello " + str;
        };
        System.out.println("ラムダ式（省略なし）: " + f1.apply("World!!"));

        // ラムダ式（省略）
        Function<String, String> f2 = str -> "Hello " + str;
        System.out.println("ラムダ式（省略）: " + f2.apply("World!!"));
    }
}
