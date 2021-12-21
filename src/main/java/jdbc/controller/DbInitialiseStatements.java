package jdbc.controller;

import jdbc.config.Config;

public interface DbInitialiseStatements {

    String DB_INITIALISE = "create database if not exists " + Config.dbName();
    String CREATE_EMPLOYEES_TABLE = "create table if not exists employees (" +
            "employeeID integer," +
            "first_name varchar(20)," +
            "last_name varchar(20))";

}
