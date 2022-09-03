package chapter3.no9;

import java.sql.*;

// AutoCloseable を実装したクラス。これで try-with-resources で使えるようになる。
class MyResource implements AutoCloseable {
    private String msg;

    MyResource(String msg) {
        this.msg = msg;
    }

    public void close() {
        System.out.println("close(): " + msg);
    }
}

public class Main {
    public static void main(String[] args) {
        // このコードの実行順序は次の通り
        // 1. try ブロックでリソースが生成される（MyResource）
        // 2. try ブロック内の処理が実行される。最後に例外が発生。
        // 3. try ブロックを抜ける直前にリソースの close() メソッドが呼ばれる
        // close() が呼ばれる順番は宣言した順番と逆。スタックで保持されてる。
        // 4. SQLException が発生したので、それを catch しているブロックに入る
        // 5. finally ブロック
        try (MyResource resource1 = new MyResource("resource1");
                MyResource resource2 = new MyResource("resource2")) {
            System.out.println("in try");
            throw new SQLException();
        } catch (SQLException e) {
            System.out.println("SQLException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("finally");
        }

        try (var obj = new MyResource("var")) {
            // var を使った宣言 is OK
        }

        // try の前に宣言されたリソースを try で使うときは実質 final 扱いとなる
        // よって、ここのコードはコンパイルエラー
        // var resource = new MyResource("try の外");
        // try (resource) {
        //     resource = new MyResource("msg");
        // }
    }

    private static void ex(MyResource resource) {
        // メソッドの引数で渡されたリソースを try ブロックで使うときは実質 final 扱いとなる。
        // したがって、再代入するとコンパイルエラーとなる（以下のコード）
        // try (resource) {
        // resource = new MyResource("msg");
        // }
    }
}
