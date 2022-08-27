package chapter2.no15;

@MyAnnotation("Type")
public class Foo {
    // MyAnnotation で @Repeatabl を適用しているからコンパイルが通る。
    // MyAnnotation の @Repeatabl を外すとコンパイルエラーとなる。
    @MyAnnotation("method1")
    @MyAnnotation("method2")
    public void method() {

    }
}
