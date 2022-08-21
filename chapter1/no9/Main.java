package chapter1.no9;

class Foo {

}

public class Main {
    public static void main(String[] args) {
        // 異なるオブジェクトを2個作成
        Foo foo1 = new Foo();
        Foo foo2 = new Foo();

        // 1個のオブジェクトを2つの参照変数で参照
        Foo foo3 = new Foo();
        Foo foo4 = foo3;

        // 参照先が異なれば equals() メソッドは false を返す
        System.out.println("foo1.equals(foo2) = " + foo1.equals(foo2));
        // 参照先が一致すれば equals() メソッドは true を返す
        System.out.println("foo3.equals(foo4) = " + foo3.equals(foo4));
        // null との比較は常に false
        System.out.println("foo3.equals(null) = " + foo3.equals(null));
    } 
}
