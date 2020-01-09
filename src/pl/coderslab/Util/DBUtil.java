package pl.coderslab.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    public static final String DB_URL = "jdbc:mysql://localhost:3306/dao?useSSL=false&characterEncoding=utf8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String DB_USER = "root";
    public static final String DB_PASS = "root";
    private static final String DELETE_QUERY = "DELETE FROM tableName WHERE id = ?"  ;

    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        return connection;
    }

}