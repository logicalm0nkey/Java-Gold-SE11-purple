package Rechapter4.no16;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gen gen = new Gen();
        // ジェネリクスを使って宣言されたメソッドを呼び出すときは、型の宣言が不要。引数や戻り値から型推論される。
        String s1 = gen.methodA("hoge");
        // 型を宣言してもよい。宣言する位置はメソッド名の前。
        String s2 = gen.<String>methodA("fuga");

        List<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);

        // 静的メソッドも型宣言不要
        Gen.methodB(list);
        // 書いてもよい。書くときはメソッド名の前。
        Gen.<String>methodB(list); 
    }
}

class Gen {
    // インスタンスメソッドでジェネリクスを使用可能
    public <T> T methodA(T value) {
        return value;
    }

    // static メソッドでジェネリクスを使用可能
    public static <T> void methodB(List<T> list) {
        for (T obj : list) {
            System.out.print(obj + " ");
        }

        System.out.println();
    }
}