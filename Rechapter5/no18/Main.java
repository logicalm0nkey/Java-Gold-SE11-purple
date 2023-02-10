package Rechapter5.no18;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // ラムダ式で要素数 n の配列を生成
        Function<Integer, String[]> f1 = n -> new String[n];
        // メソッド参照で要素数 n の配列を生成
        Function<Integer, String[]> f2 = String[]::new;
        System.out.println("ラムダ式: " + f1.apply(2).length);
        System.out.println("メソッド参照: " + f2.apply(3).length);
    }
}
