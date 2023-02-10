package Rechapter5.no2;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // 匿名クラスで関数型インターフェースを実装
        String s = new Function<String, String>() {
            public String apply(String s) {
                return "hello " + s;
            }
        }.apply("world!");
        System.out.print(s);
    }
}
