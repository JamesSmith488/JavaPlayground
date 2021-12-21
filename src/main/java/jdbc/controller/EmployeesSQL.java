package jdbc.controller;

import jdbc.config.Config;

public interface EmployeesSQL {

    String ADD_EMPLOYEE = "insert into employees (employeeID, first_name, last_name) values(?, ?, ?)";
    String GET_ALL_EMPLOYEES = "select * from employees";

}
