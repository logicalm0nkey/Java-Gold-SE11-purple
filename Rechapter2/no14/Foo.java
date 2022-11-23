package Rechapter2.no14;

/**
 * MyInter
 */
@MyAnnot("MyInter#type")
interface MyInter {
    @MyAnnot("MyInter#method")
    public void method();
}

class ChildB implements MyInter {
    protected String s;

    public void method() {

    }
}

@MyAnnot("Parent#type")
class Parent {
    @MyAnnot("Parent#field")
    protected String s;

    @MyAnnot("Parent#method")
    public void method() {

    }
}

class ChildA extends Parent {
    protected String s;

    public void method() {
        
    }
}

@MyAnnot("ChildC#type")
class ChildC extends Parent {
    @MyAnnot("ChildC#field")
    protected String s;

    @MyAnnot("ChildC#method")
    public void method() {

    }
}

public class Foo {

}
