/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myconnection;
import java.sql.*;
/**
 *
 * @author VIDHI RATHI
 */
public class Mycon {
   static Connection con=null;
   static Connection getConnection() throws SQLException
   {
       try 
       {
           Class.forName("com.mysql.jdbc.Driver");
           System.out.print("driver load successfully");
       }
       catch(ClassNotFoundException e)
       {
           System.out.print(e);
       }
       try
       {
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/diet","root","root");
           System.out.print("database connected");
       }
   catch(SQLException e)
   {
       System.out.print(e);
   }
      
  con.close();
       return null;
       
   }
   
}
