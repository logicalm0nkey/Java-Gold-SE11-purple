package chapter1.no13;

interface Foo {
    // interface で static メソッドを定義できる
    // アクセス修飾子は、略すと勝手に public になる（抽象メソッドと同じ）
    static void method() {
        hoo();
        System.out.println("Foo.method()");
    }

    // interface で protected は使えない
    // protected static void nya() {

    // }

    // private は使える
    private static void hoo() {
        System.out.println("Foo.hoo");
    }
}

public class Main {
    public static void main(String[] args) {
        Foo.method();
    }
}
