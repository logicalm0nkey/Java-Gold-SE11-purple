package Rechapter5.no20;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // ラムダ式で ToIntFunction
        ToIntFunction<String> f1 = s -> s.length();
        int ans1 = f1.applyAsInt("hoge");
        // メソッド参照で ToIntFunction
        ToIntFunction<String> f2 = String::length;
        int ans2 = f2.applyAsInt("ty");
        // Integer 型でも受け取れる
        Integer ans3 = f2.applyAsInt("hus");
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);

        IntToDoubleFunction f4 = i -> i * 1.5;
        double d = f4.applyAsDouble(2);
        System.out.println(d);
    }
}
