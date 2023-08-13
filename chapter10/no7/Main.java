package chapter10.no7;

import java.sql.*;
import chapter10.DbConnector;

public class Main {
    public static void main(String[] args) {
        String sql = "DELETE FROM department WHERE dept_code  = ?";

        try (Connection connection = DbConnector.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, Integer.parseInt(args[0]));
            int cols = statement.executeUpdate();
            System.out.println("削除件数: " + cols);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
