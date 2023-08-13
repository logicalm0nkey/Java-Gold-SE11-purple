package chapter10.no11;

import java.sql.*;
import chapter10.DbConnector;

public class Main {
    public static void main(String[] args) {
        String sql = "SELECT dept_code, dept_name FROM department ORDER BY dept_code ASC";

        try (Connection connection = DbConnector.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_UPDATABLE)) {
            ResultSet result = statement.executeQuery();

            // 最後の行に移動
            result.last();
            System.out.println("最後の行番号: " + result.getRow());

            // 最後の行の後ろにカーソルを移動
            result.afterLast();
            // 逆方向（後ろから前）にスクロール
            while (result.previous()) {
                System.out.println(result.getInt("dept_code") + " " + result.getString("dept_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
