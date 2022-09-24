package chapter5.no17;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

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
        // これでコンストラクタが呼べるらしい。引数無しのコンストラクタが呼ばれる。
        Supplier<Foo> sup = Foo::new;
        System.out.println(sup.get().a);

        // この場合は Foo クラスの Integer (int) を引数に持つコンストラクタが呼ばれる
        Function<Integer, Foo> func = Foo::new;
        System.out.println(func.apply(10).a);

        // これで勝手に Foo 型の ArrayList が作成される。右辺はダイアモンド演算子で型を略せるってやつの応用か。
        Supplier<List<Foo>> sup2 = ArrayList::new;
        System.out.println(sup2.get().size());

        // Foo 型の Set 作成
        Set<Foo> set = Set.of(new Foo(10), new Foo(20));
        // Set<Foo> を引数に取り ArrayList<Foo> を返す apply() メソッドの定義
        Function<Set<Foo>, List<Foo>> func2 = ArrayList::new;
        System.out.println(func2.apply(set).size());
    }
}
