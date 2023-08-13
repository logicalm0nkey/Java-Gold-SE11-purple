package chapter10.no10;

import java.sql.*;
import chapter10.DbConnector;

public class Main {
    public static void main(String[] args) {
        String callString = "{call myProcedure (?, ?)}";
        try (Connection connection = DbConnector.getConnection();
                CallableStatement statement = connection.prepareCall(callString)) {
            statement.setInt(1, 110000);
            statement.registerOutParameter(2, java.sql.Types.BIGINT);
            statement.execute();

            System.out.println("結果: " + statement.getInt(2));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
