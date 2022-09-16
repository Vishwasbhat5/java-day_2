package com.sonata.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sonata.CustomerBean.Member;

public class RegisterDao {
    public  int registeremployee(Member member) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO customertable values(?,?,?,?,?);";


          int result = 0;

          Class.forName("com.mysql.jdbc.Driver");


          try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/customers", "root", "root@123");

              // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
                preparedStatement.setString(1, member.getCustomerId());
                preparedStatement.setString(2,member.getName());
                preparedStatement.setString(3,member.getPassword());
                preparedStatement.setString(4, member.getEmail());
                preparedStatement.setString(5, member.getContact());
               
                System.out.println(preparedStatement);
                // Step 3: Execute the query or update query
                result = preparedStatement.executeUpdate();





          } catch (SQLException e) {
                // process sql exception
                e.printStackTrace();
            }
            return result;
        }






   }