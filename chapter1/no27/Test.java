package chapter1.no27;

public class Test {
    // 抽象クラスとしてのインナークラスも定義可能
    abstract class A {
        abstract void method();
    }

    // ネストクラスで継承が可能
    class B extends A {
        @Override
        void method() {
            
        }
    }

    // インターフェースとしてのインナークラスも定義可能
    interface X {
        void bar();
    }

    // ネストクラスで実装が可能
    class Y implements X {
        public void bar() {

        }
    }

}