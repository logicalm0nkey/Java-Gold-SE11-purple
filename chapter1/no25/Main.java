package chapter1.no25;

public class Main {
    class A {
        void methodA() {
            System.out.println("methodA()");
        }
    }

    static class B {
        static void methodB() {
            System.out.println("methodB()");
        }
    }

    public static void main(String[] args) {
        // enclosing class のメソッドからネストクラスのメンバにアクセス可能
        new Main().new A().methodA();
        new Main.B().methodB();
        Main.B.methodB();
    }
}
