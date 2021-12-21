package jdbc.controller;

import jdbc.config.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    public static Connection dbInitialiseConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(Config.dbConnectionUrl(), Config.dbUsername(), Config.dbPassword());
            System.out.println("connected to db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static Connection dbTestConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(Config.dbConnectionUrl() + "/" + Config.dbName(), Config.dbUsername(), Config.dbPassword());
            System.out.println("connected to db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(Connection connection){
        try {
            connection.close();
            //logging here
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
