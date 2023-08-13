package chapter10.no13;

import java.sql.*;
import chapter10.DbConnector;

public class Main {
    public static void main(String[] args) {
        String sql = "SELECT dept_code, dept_address FROM department WHERE dept_code = 4";

        try (Connection connection = DbConnector.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_UPDATABLE)) {
            // まずはクエリの結果を読み込む
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                System.out.println(result.getString(2));
            }

            // dept_address を Chiba に更新
            result.updateString(2, "Chiba");
            // DB に反映
            result.updateRow();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
