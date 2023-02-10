package Rechapter5.no17;

import java.util.*;
import java.util.function.*;

class Foo {
    int a = 0;

    Foo() {
    }

    Foo(int a) {
        this.a = a;
    }
}

public class Main {
    public static void main(String[] args) {
        // ラムダ式で引数無しのコンストラクタを呼び出す
        Supplier<Foo> supplier1 = () -> new Foo();
        // メソッド参照で引数無しのコンストラクタを呼び出す
        Supplier<Foo> supplier2 = Foo::new;
        System.out.println("ラムダ式: " + supplier1.get().a);
        System.out.println("メソッド参照: " + supplier2.get().a);

        // ラムダ式で引数ありのコンストラクタを呼び出す
        Function<Integer, Foo> function1 = i -> new Foo(i);
        // メソッド参照で引数ありのコンストラクタを呼び出す
        // この書き方で、 Integer を引数に取る Foo のコンストラクタが呼びされる
        Function<Integer, Foo> function2 = Foo::new;
        System.out.println("ラムダ式: " + function1.apply(1).a);
        System.out.println("メソッド参照: " + function2.apply(2).a);

        // ラムダ式でリストを作成
        Supplier<List<Foo>> supplier3 = () -> new ArrayList<>();
        // メソッド参照でリスを問作成
        // 左辺で Foo 型のオブジェクトを格納すると宣言してるから、 ArrayList の要素の型は勝手に推論されるっポイ
        Supplier<List<Foo>> supplier4 = ArrayList::new;
        System.out.println("ラムダ式: " + supplier3.get().size());
        System.out.println("メソッド参照: " + supplier4.get().size());

        // ラムダ式で引数ありのコンストラクタを呼んでリストを作成
        Function<Set<Foo>, List<Foo>> function3 = s -> new ArrayList<>(s);
        // メソッド参照で引数ありのコンストラクタを呼んでリストを作成
        Function<Set<Foo>, List<Foo>> function4 = ArrayList::new;
        Set<Foo> s = Set.of(new Foo(), new Foo(10));
        System.out.println("ラムダ式: " + function3.apply(s).size());
        System.out.println("メソッド参照: " + function4.apply(s).size());
    }
}
