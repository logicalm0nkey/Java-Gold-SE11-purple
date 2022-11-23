package Rechapter2.no15;

@MyAnnot("test")
public class Foo {
    // @Repeatable を宣言したアノテーションだから複数回使える。 @Repeatable を宣言していないとコンパイルエラーとなる。
    @MyAnnot("test2")
    @MyAnnot("test3")
    public void method() {
        
    }
}
