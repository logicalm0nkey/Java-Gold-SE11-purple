package Rechapter3.no10;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try (MyResource resource1 = new MyResource("resource1");
                MyResource resource2 = new MyResource("resource2")) {
            resource1.method();
        } catch (SQLException e) {
            System.out.println("e.getMessage(): " + e.getMessage());

            System.out.println("e.getSuppressed() で取り出した情報");
            Throwable[] errors = e.getSuppressed();
            System.out.println("抑制された例外の数: " + errors.length);
            for (Throwable ex : errors) {
                System.out.println(ex.getMessage());
            }
        } finally {
            System.out.println("finally ブロック");
        }
    }
}

class MyResource implements AutoCloseable {
    private String msg;

    public MyResource(String msg) {
        this.msg = msg;
    }

    public void method() throws SQLException {
        throw new SQLException("method() でのエラー");
    }

    public void close() throws SQLException {
        System.out.println("close(): " + msg);

        // close() メソッドで発生した例外は抑制される（try-with-resources の catch ブロックでキャッチされない）
        throw new SQLException("close() でのエラー: " + msg);
    }
}