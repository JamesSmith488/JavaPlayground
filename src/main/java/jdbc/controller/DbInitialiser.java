package jdbc.controller;

import java.sql.Connection;
import java.sql.SQLException;

public class DbInitialiser {

    private static void initialiseDb(){
        try {
            Connection connection = ConnectionManager.dbInitialiseConnection();
            connection.createStatement().executeUpdate(DbInitialiseStatements.DB_INITIALISE);
            ConnectionManager.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void initialiseEmployeeTable(){
        try {
            Connection connection = ConnectionManager.dbTestConnection();
            connection.createStatement().executeUpdate(DbInitialiseStatements.CREATE_EMPLOYEES_TABLE);
            ConnectionManager.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void initialiseDbFirstInstance(){
        initialiseDb();
        initialiseEmployeeTable();
    }

}
