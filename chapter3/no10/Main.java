package chapter3.no10;

import java.sql.*;

class MyResource implements AutoCloseable {
    private String msg;

    MyResource(String msg) {
        this.msg = msg;
    }

    void method() throws SQLException {
        // リソース内のメソッドで例外を発生させる
        throw new SQLException("method() での例外");
    }

    public void close() throws SQLException {
        System.out.println("close()" + msg);
        // close() でも例外を発生させる
        throw new SQLException("close() での例外 @" + msg);
    }
}

public class Main {
    public static void main(String[] args) {
        try (var resource1 = new MyResource("resource1");
                var resource2 = new MyResource("resource2")) {
            // ここで例外が発生
            resource1.method();

            // 自動で close() が呼ばれるが、 close() の中でも例外が発生
        } catch (SQLException sqle) {
            // catch ブロックで捕捉されるのは try ブロック内のメソッドで発生した例外。method() の例外。
            // close() ではない。
            System.out.println("sqle.getMessage(): " + sqle.getMessage());

            // close() の例外は method() の例外を捕捉するために「抑制」されているので、このコードで取得する
            // 取得する際は「catch ブロックで捕捉した例外オブジェクト」を使う
            Throwable[] suppressed = sqle.getSuppressed();

            System.out.println("method() の例外を捕捉するために抑制された例外の数: " + suppressed.length);

            for (Throwable e : suppressed) {
                System.out.println(e.getMessage());
            }
        } finally {
            System.out.println("finally");
        }
    }
}
