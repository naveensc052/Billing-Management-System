/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
/**
 *
 * @author hp
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Connection con = DriverManager.getConnection("jdbc://localhost:3306/bms","root","MYSQL");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms?autoReconnect=true&useSSL=false","root","MYSQL");
            System.out.print(con);
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
}
