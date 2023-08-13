package chapter10.no3;

import java.sql.*;
import chapter10.DbConnector;

public class Main {
    public static void main(String[] args) {
        String sql = "SELECT dept_name FROM department WHERE dept_code = ? OR dept_code = ?";

        try (Connection connection = DbConnector.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, 1);
            statement.setInt(2, 3);

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                System.out.println("dept_name: " + result.getString("dept_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
