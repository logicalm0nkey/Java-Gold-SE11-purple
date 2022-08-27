package chapter2.no13;

// これはコンパイルエラー。 @Target で TYPE を指定していないから。
//@MyAnnotation
public class Foo {
    // @Target で ElementType.FIELD を指定しているのでOK
    @MyAnnotation
    int num;

    // @Target で ElementType.METHOD を指定しているのでOK
    // アノテーションの利用は任意なので、別に使わなくてもOK
    //@MyAnnotation
    public void method() {

    }
}
