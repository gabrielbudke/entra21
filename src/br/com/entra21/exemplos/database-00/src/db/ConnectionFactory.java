package db;

import java.sql.*;

public class ConnectionFactory {
    private static String HOST = "jdbc:mysql://localhost/exemplo_banco_dados_00";
    private static String USERNAME = "root";
    private static String PASSWORD = "root";

    private static Connection connection;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            if(connection != null) {
                connection.close();
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

}
