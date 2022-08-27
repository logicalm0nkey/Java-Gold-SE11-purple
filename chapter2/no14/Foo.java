package chapter2.no14;

// インターフェースにアノテーションをつける。 @Inherited の挙動を確かめるため。
@MyAnnotation("MyInter#Type")
interface MyInter {
    // メソッドにアノテーションをつける。 @Inherited の挙動を確かめるため。
    @MyAnnotation("MyInter#method")
    void method();
}

// クラスにアノテーションをつける。 @Inherited の挙動を確かめるため。
@MyAnnotation("Parent#Type")
class Parent {
    // フィールドにアノテーションをつける。 @Inherited の挙動を確かめるため。
    @MyAnnotation("Parent#field")
    protected String field;

    // メソッドにアノテーションをつける。 @Inherited の挙動を確かめるため。
    @MyAnnotation("Parent#method")
    public void method() {

    }
}

// Parent を継承した子クラス。アノテーションの記述無し。
class ChildA extends Parent {
    protected String field;

    public void method() {
    }
}

// MyInter を実装したサブクラス。アノテーションの記述無し。
class ChildB implements MyInter {
    protected String field;

    public void method() {

    }
}

// Parent を継承したクラス。アノテーションの記述アリ。
@MyAnnotation("ChildC#Type")
class ChildC extends Parent {
    @MyAnnotation("ChildC#field")
    protected String field;

    @MyAnnotation("ChildC#method")
    public void method() {
    }
}

public class Foo {
}
