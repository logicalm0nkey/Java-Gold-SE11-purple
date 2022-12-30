package Rechapter3.no9;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try (MyResource resource1 = new MyResource("resource1");
                MyResource resource2 = new MyResource("resource2")) {
            System.out.println("try ブロック内の処理");
            throw new SQLException();
        } catch (SQLException e) {
            System.out.println("catch ブロック: SQLException");
        } catch (Exception e) {
            System.out.println("catch ブロック: Exception");
        } finally {
            System.out.println("finally ブロック内の処理");
        }
    }
}

// 独自のリソースクラス
class MyResource implements AutoCloseable {
    private String msg;

    public MyResource(String msg) {
        this.msg = msg;
    }

    public void close() throws Exception {
        System.out.println("close(): " + msg);
    }
}
