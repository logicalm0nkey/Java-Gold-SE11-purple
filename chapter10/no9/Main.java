package chapter10.no9;

import java.sql.*;
import chapter10.DbConnector;

public class Main {
    public static void main(String[] args) {
        String sql = "INSERT INTO department VALUES (?, ?, ?, ?)";

        Object pilot_number = null;
        if (args.length >= 1) {
            pilot_number = args[0];
        }

        try (Connection connection = DbConnector.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, 8);
            statement.setString(2, "Support");
            statement.setString(3, "Miyagi");

            if (pilot_number == null) {
                // パラメーターに NULL を指定するときはこう書く
                statement.setNull(4, java.sql.Types.NULL);
            } else {
                // パラメーターに Object 型を設定するときは、必ず DB における型を指定する
                statement.setObject(4, pilot_number, java.sql.Types.VARCHAR);
            }

            int cols = statement.executeUpdate();
            System.out.println("登録件数: " + cols);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
