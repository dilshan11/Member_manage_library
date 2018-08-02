/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.library.Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS™
 */
public class DBconnction {
     private Connection connection;
    private static DBconnction dBconnction;
    private DBconnction() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection=DriverManager.getConnection("jdbc:mysql://localhost/library","root","nanayakkara");
         System.out.println("aaaaaaaaaaaaaaaaaaa");
    }
     public static DBconnction getDBconnection() throws ClassNotFoundException, SQLException{
        if(dBconnction==null){
            dBconnction=new DBconnction();
        }
        return dBconnction;
    }

    /**
     * @return the connection
     */
    public Connection getConnection() {
        return connection;
    }
     
}
