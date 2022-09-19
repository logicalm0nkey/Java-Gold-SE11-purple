package chapter4.no6;

import java.util.*;

class Foo {
    private String s;

    public Foo(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }

    public int hashCode() {
        // 等価性を定義するため hasCode() をオーバーライド
        return s.hashCode();
    }

    public boolean equals(Object obj) {
        // 等価性を定義するため equals() をオーバーライド
        return this.hashCode() == obj.hashCode();
    }
}

public class Main {
    public static void main(String[] args) {
        // 自作クラスの HashSet も作れる
        HashSet<Foo> hashSet = new HashSet<>();
        hashSet.add(new Foo("BBB"));
        hashSet.add(new Foo("AAA"));
        hashSet.add(new Foo("CCC"));
        // equals() をオーバーライドしているので、これは１個目の要素と同じオブジェクトとみなされる。
        // したがって、要素として追加されない。
        hashSet.add(new Foo("BBB"));

        // 3
        System.out.println("HashSet size: " + hashSet.size());
        for (Foo f : hashSet) {
            System.out.print(f + " ");
        }
    }
}
