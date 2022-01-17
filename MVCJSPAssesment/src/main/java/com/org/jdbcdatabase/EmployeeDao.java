package com.org.jdbcdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.w3c.dom.ls.LSOutput;

import com.org.jspmvc.Employee;

public class EmployeeDao {
    public int registerEmployee(Employee employee) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO employee" +
            "  (first_name, last_name, username, password, address, contact) VALUES " +
            " ( ?, ?, ?, ?,?,?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("test");
        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/db_registration","root","root");

           
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            
            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setString(3, employee.getUsername());
            preparedStatement.setString(4, employee.getPassword());
            preparedStatement.setString(5, employee.getAddress());
            preparedStatement.setString(6, employee.getContact());

            System.out.println(preparedStatement);
            
            result = preparedStatement.executeUpdate();
            

        } catch (SQLException e) {
            System.out.print(e);
           
        }
        return result;
    }
}