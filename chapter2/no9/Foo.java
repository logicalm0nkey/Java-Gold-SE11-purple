package chapter2.no9;

// MyAnnotation で適用箇所を明示していないので、クラスでもメソッドでも適用できる。
@MyAnnotation
public class Foo {
    @MyAnnotation
    public void method() {

    }
}
