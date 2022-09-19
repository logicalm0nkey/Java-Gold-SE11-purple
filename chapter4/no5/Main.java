package chapter4.no5;

import java.util.*;

class Foo {
    private String s;

    public Foo(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }
}

public class Main {
    public static void main(String[] args) {
        // 自作クラスの HashSet も作れる
        HashSet<Foo> hashSet = new HashSet<>();
        hashSet.add(new Foo("BBB"));
        hashSet.add(new Foo("AAA"));
        hashSet.add(new Foo("CCC"));
        // 1個目と同じフィールドを持つオブジェクトだが、別々に new しているので別物として扱われる。
        // したがって、これは新たに要素として追加される。
        // equals() メソッドの結果で判断してる。
        hashSet.add(new Foo("BBB"));

        // 4
        System.out.println("HashSet size: " + hashSet.size());
        for (Foo f : hashSet) {
            System.out.print(f + " ");
        }
    }
}
