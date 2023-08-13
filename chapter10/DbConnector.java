package chapter10;

import java.sql.*;

public class DbConnector {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mariadb://localhost:3306/java_gold_db";

        return DriverManager.getConnection(url, "root", "Aly4359");
    }
}
