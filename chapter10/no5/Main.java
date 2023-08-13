package chapter10.no5;

import java.sql.*;
import chapter10.DbConnector;

public class Main {
    public static void main(String[] args) {
        String sql = "INSERT INTO department VALUES (6, 'Planning', 'Yokohama', '045-333-xxxx')";

        try (Connection connection = DbConnector.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {
            int cols = statement.executeUpdate();
            System.out.println("登録件数: " + cols);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
