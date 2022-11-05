package chapter1.ex.no13;

public class Main {
    static interface A {

    }

    static class B implements A {

    }

    static class C extends B {

    }

    public static void main(String[] args) {
        C c = new C();
        A a = c;
    }

    
}
