package Rechapter5.no1;

import java.util.function.Function;

// 関数型インターフェースの従来の実装方法
class Func implements Function<String, String> {
    public String apply(String s) {
        return "hello " + s;
    }
}

public class Main {
    public static void main(String[] args) {
        Func func = new Func();
        System.out.print(func.apply("world!"));
    }
}
