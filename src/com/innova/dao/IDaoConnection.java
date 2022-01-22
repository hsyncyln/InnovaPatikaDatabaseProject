package com.innova.dao;

import com.innova.util.DatabaseConnection;

import java.sql.Connection;
import java.util.ArrayList;

public interface IDaoConnection<T> {

    //CRUD
    public void Insert(T t);
    public void Update(T t);
    public void Delete(T t);
    public ArrayList<T> List();

    //Connection
    public default Connection getInterfaceConnection(){
        return DatabaseConnection.getInstance().getConnection();
    }
}
