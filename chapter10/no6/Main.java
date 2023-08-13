package chapter10.no6;

import java.sql.*;
import chapter10.DbConnector;

public class Main {
    public static void main(String[] args) {
        String sql = "UPDATE department SET dept_address = 'Tokyo', pilot_number = '03-6666-xxxx' WHERE dept_code  = ?";

        try (Connection connection = DbConnector.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, Integer.parseInt(args[0]));
            int cols = statement.executeUpdate();
            System.out.println("更新件数: " + cols);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
