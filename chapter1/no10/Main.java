package chapter1.no10;

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

        // 参照先が異なれば hashCode() メソッドは異なる値を返す
        System.out.println("foo1.hashCode() = " + foo1.hashCode());
        System.out.println("foo2.hashCode() = " + foo2.hashCode());
        // 参照先が一致すれば hashCode() メソッドは同じ値を返す
        System.out.println("foo3.hashCode() = " + foo3.hashCode());
        System.out.println("foo4.hashCode() = " + foo4.hashCode());
    } 
}
