package jdbc.controller;

import jdbc.config.Config;
import jdbc.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {

    public static void addEmployee(int employeeId, String firstName, String lastName){
        Employee employee = new Employee(employeeId, firstName, lastName);
        try {
            Connection connection = ConnectionManager.dbTestConnection();
            connection.createStatement().execute("insert into employees values ( " +
                    employee.getEmployeeID() + ", " +
                    "\"" + employee.getFirstName() + "\", " +
                    "\"" + employee.getLastName() + "\");");
            ConnectionManager.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addEmployeePreparedStatement(int employeeId, String firstName, String lastName){
        try {
            Connection connection = ConnectionManager.dbTestConnection();
            PreparedStatement employeePreparedStatement = connection.prepareStatement(EmployeesSQL.ADD_EMPLOYEE);
            employeePreparedStatement.setInt(1,employeeId);
            employeePreparedStatement.setString(2,firstName);
            employeePreparedStatement.setString(3,lastName);
            employeePreparedStatement.executeUpdate();
            ConnectionManager.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getAllEmployees(){
        try {
            Connection connection = ConnectionManager.dbTestConnection();
            ResultSet resultSet = connection.createStatement().executeQuery(EmployeesSQL.GET_ALL_EMPLOYEES);
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //addEmployeePreparedStatement(3,"John","Doe");
        getAllEmployees();
    }

}
