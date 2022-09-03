package chapter3.no7;

// 自作例外クラス
class MyExceptionA extends Exception {
    MyExceptionA() {
        super("MyExceptionA");
    }
}

// 自作例外クラス
class MyExceptionB extends Exception {
    MyExceptionB() {
        super("MyExceptionB");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            method();
        } catch (MyExceptionA | MyExceptionB e) {
            // try ブロック内のメソッドで throws 指定されている例外クラスは、必ず catch を書く必要がある。
            System.out.print(e.getMessage());
        }
    }

    // throws には、実際に throw されうる例外オブジェクトの型、またはその親クラスの型を書く。
    // 今回なら、 Exception を書いてもOK
    static void method() throws MyExceptionA, MyExceptionB {
        int num = (int)(Math.random() * 10);

        try {
            if (num < 4) {
                // 作成される例外オブジェクトの方は MyExceptionA
                throw new MyExceptionA();
            } else {
                // 作成される例外オブジェクトの方は MyExceptionB
                throw new MyExceptionB();
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
