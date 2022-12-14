package com.example.quizapplication;

import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection {
    public Connection databaseLink;

    //to connect to database
    public Connection getConnection(){
        String databaseName = "cat_db";
        //Set username and password later
        String databaseUser = "root";
        String databasePassword = "thinesh2502";

        String url = "jdbc:mysql://localhost/" + databaseName;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
        }catch(Exception e){
            e.printStackTrace();
        }
        return databaseLink;
    }
}
