package Rechapter4.no6;

import java.util.HashSet;

class Foo {
    private String str;

    public Foo(String str) {
        this.str = str;
    }

    public String toString() {
        return str + " ";
    }

    public int hashCode() {
        return str.hashCode();
    }

    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }
}

public class Main {
    public static void main(String[] args) {
        HashSet<Foo> hashSet = new HashSet<>();
        hashSet.add(new Foo("BBB"));
        hashSet.add(new Foo("AAA"));
        hashSet.add(new Foo("CCC"));
        // equals() メソッドをオーバーライドしており、文字列のハッシュコードが一致していたら Foo オブジェクトとして一致しているとみなされるので、
        // この要素は2個目の AAA と同一オブジェクトとみなされ、追加されない。
        hashSet.add(new Foo("AAA"));

        // オブジェクトの重複が省かれ size() = 3
        System.out.println("size(): " + hashSet.size());

        for (Foo foo : hashSet) {
            // 3つ表示される
            System.out.print(foo + " ");
        }
    }
}
