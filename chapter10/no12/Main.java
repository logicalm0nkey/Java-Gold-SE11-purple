package chapter10.no12;

import java.sql.*;
import chapter10.DbConnector;

public class Main {
    public static void main(String[] args) {
        String sql = "SELECT dept_code FROM department ORDER BY dept_code ASC";

        try (Connection connection = DbConnector.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_UPDATABLE)) {
            ResultSet result = statement.executeQuery();
            // 1行目に移動
            result.absolute(1);
            System.out.println("1行目の主キー: " + result.getInt(1));
            // 最後の行に移動
            result.absolute(-1);
            System.out.println("最後の主キー: " + result.getInt(1));
            // 最後の行の1個前に移動
            result.absolute(-2);
            System.out.println("最後の1個前の主キー: " + result.getInt(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
