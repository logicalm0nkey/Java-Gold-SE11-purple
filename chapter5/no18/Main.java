package chapter5.no18;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Integer (int) を引数に取る String[] 型のコンストラクタを呼び出す。
        Function<Integer, String[]> func = String[]::new;
        System.out.println(func.apply(10).length);
    }
}
