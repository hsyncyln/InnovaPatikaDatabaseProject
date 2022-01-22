package com.innova.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection extends DatabaseInformation{
    //Database connection
    private Connection connection;

    //Database connection information
    private  String url = this.getUrl();
    private String userName = this.getUserName();
    private String password = this.getUserPassword();

    //Singleton Design Patern
    private  static DatabaseConnection instance;

    private DatabaseConnection(){
        try {
            Class.forName(getForNameData());
            System.out.println("Driver Success !!!");
            try {
                connection = DriverManager.getConnection(url,userName,password);
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Connection Failed");
            }
            System.out.println("Connection Success");
        } catch (ClassNotFoundException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
    }


    public static DatabaseConnection getInstance(){
        try {
            if(instance == null)
                instance = new DatabaseConnection();
            else if(instance.connection.isClosed())
                instance = new DatabaseConnection();
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
        return instance;

    }

    //Getter and setter
    public Connection getConnection() {
        return connection;
    }
    public DatabaseConnection setConnection(Connection connection) {
        this.connection = connection;
        return this;
    }

}
