package chapter10.no4;

import java.sql.*;
import chapter10.DbConnector;

public class Main {
    public static void main(String[] args) {
        String sql = "SELECT dept_name FROM department WHERE pilot_number = ?";

        try (Connection connection = DbConnector.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, args[0]);

            ResultSet result = statement.executeQuery();

            if (result != null) {
                System.out.println("result != null");
            }

            while (result.next()) {
                System.out.println("dept_name: " + result.getString("dept_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
