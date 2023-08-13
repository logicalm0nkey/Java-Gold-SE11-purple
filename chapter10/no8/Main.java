package chapter10.no8;

import java.sql.*;
import chapter10.DbConnector;

public class Main {
    public static void main(String[] args) {
        // insert 文
        String insert = "INSERT INTO department VALUES (7, 'Planning', 'Yokohama', '045-333-xxxx')";
        // select 文
        String select = "SELECT dept_name FROM department WHERE dept_code  = 2";

        try (Connection connection = DbConnector.getConnection();
                PreparedStatement insertStatement = connection.prepareStatement(insert);
                PreparedStatement selectStatement = connection.prepareStatement(select);) {
            disp(insertStatement);
            disp(selectStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void disp(PreparedStatement statement) throws SQLException {
        // select 文も他の SQL も何でもござれの便利メソッド（戻り値は💩）
        boolean isResultSet = statement.execute();

        if (isResultSet) {
            ResultSet result = statement.getResultSet();
            result.next();
            System.out.println("dept_name: " + result.getString("dept_name"));            
        } else {
            int cols = statement.getUpdateCount();
            System.out.println("更新件数: " + cols);
        }
    }
}
