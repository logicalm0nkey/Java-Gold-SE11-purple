package Rechapter4.no5;

import java.util.HashSet;

class Foo {
    private String str;

    public Foo(String str) {
        this.str = str;
    }

    public String toString() {
        return str;
    }
}

public class Main {
    public static void main(String[] args) {
        HashSet<Foo> hashSet = new HashSet<>();
        hashSet.add(new Foo("BBB"));
        hashSet.add(new Foo("AAA"));
        hashSet.add(new Foo("CCC"));
        // メンバ変数の値は重複しているが、上の AAA とは別のオブジェクトが作られているので、普通に追加される。
        // 「重複」の判定には equals() が使われる。
        hashSet.add(new Foo("AAA"));

        // オブジェクトの重複はないので size() = 4
        System.out.println("size(): " + hashSet.size());

        for (Foo foo : hashSet) {
            // 4つ表示される
            System.out.print(foo + " ");
        }
    }
}
