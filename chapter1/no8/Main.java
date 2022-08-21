package chapter1.no8;

class Foo {
}

class Bar {
    public String toString() {
        return "this is an object made by Bar";
    }
}

public class Main {
    public static void main(String[] args) {
        int[] ary = {1, 2};
        String s = "hoge";
        Foo foo = new Foo();
        Bar bar = new Bar();

        // Object.toString() の挙動の確認
        System.out.println(ary);
        System.out.println(s);
        System.out.println(foo);
        System.out.println(bar);
    }
}
