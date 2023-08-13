package chapter10.no1.src;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;

        // クエリ
        String sql = "select dept_code, dept_name from department";

        try {
            // 接続先 url
            String url = "jdbc:mariadb://localhost:3306/java_gold_db";

            // Class.forName("org.mariadb.jdbc.Driver");

            // url, id, password で接続
            connection = DriverManager.getConnection(url, "root", "Aly4359");
            // sql 文のプリコンパイル。真価を発揮するのはパラメーターを使ったときらしい。
            preparedStatement = connection.prepareStatement(sql);
            // sql 文実行。
            result = preparedStatement.executeQuery();

            // 結果の取得と表示
            while (result.next()) {
                // System.out.println("dept_code: " + result.getInt(1));
                // System.out.println("dept_name: " + result.getString(2));
                System.out.println("dept_code: " + result.getInt("dept_code"));
                System.out.println("dept_name: " + result.getString("dept_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (result != null) {
                    result.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
