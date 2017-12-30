/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author VIDHI RATHI
 */
public class DietForm extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session=request.getSession();
        
        String gender=request.getParameter("Gender");
        String disease=request.getParameter("Disease");
        String allergy=request.getParameter("Allergy");
        String category=request.getParameter("category");
        String other=request.getParameter("Other");
        
       
          try{
              Class.forName("com.mysql.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/diet","root","root");
              String qr;
              String qr1;
              ResultSet rs;

       if(disease.equals("Obesity") && allergy.equals("SeaFood") && category.equals("Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
          {   
       String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case1.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case1.jsp");
        }
            else
        {
              qr="insert into chart values(?,'case1.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case1.jsp");
        }
          }
          else if(disease.equals("Diabetes") && allergy.equals("SeaFood") && category.equals("Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
          {  
              
       String email=(String)session.getAttribute("email");
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case2.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case2.jsp");
        }
       
              
           else
              {
              qr="insert into chart values(?,'case2.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case2.jsp");
          }
          }
          
          else if(disease.equals("Blood Pressure") && (allergy.equals("SeaFood")||allergy.equals("Peanut")) && category.equals("Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
          {
              
              String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case3.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case3.jsp");
        }
            else
        {
          qr="insert into chart values(?,'case3.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case3.jsp");
          }
              
          }    
            
          
          
         else if(disease.equals("Jaundice") && (allergy.equals("SeaFood")||allergy.equals("Peanut")||allergy.equals("Egg")) && (category.equals("Vegetarian")||category.equals("Non-Vegetarian")) && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
          {
              String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case4.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case4.jsp");
        }
            else
        {
              
              
              qr="insert into chart values(?,'case4.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case4.jsp");
          }
          }
         
         
         
         
         
          else if(disease.equals("None") && (allergy.equals("None")) && (category.equals("Non-Vegetarian")||category.equals("Vegetarian")) && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
          {
              String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case5.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case5.jsp");
        }
            else
        {
              
              qr="insert into chart values(?,'case5.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case5.jsp");
          }
          }
         
         
         
         
         
         
          
         else if(disease.equals("Typhoid") && (allergy.equals("SeaFood")||allergy.equals("Peanut")||allergy.equals("Egg")||allergy.equals("Milk Products")||allergy.equals("Lime")) && category.equals("Non-Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
          {
              String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case6.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case6.jsp");
        }
            else
        {
              
              qr="insert into chart values(?,'case6.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case6.jsp");
          }
          }
          
         
         
         
        else if(disease.equals("Jaundice") && allergy.equals("Milk") && (category.equals("Vegetarian")||category.equals("Non-Vegetarian")) && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
            {
                
                String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case8.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case8.jsp");
        }
            else
        {
              
              qr="insert into chart values(?,'case8.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case8.jsp");
          }
          }
          
          
          
          
          
          
          
          
          
          
          
        else if(disease.equals("Jaundice") && allergy.equals("Lime") && (category.equals("Vegetarian")||category.equals("Non-Vegetarian")) && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
            {
                
                String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case9.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case9.jsp");
        }
            else
        {
                
              qr="insert into chart values(?,'case9.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case9.jsp");
          }
          }
        
        
        
        
        
        
        
        
        
      else if(disease.equals("Obesity") && allergy.equals("Milk") && category.equals("Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
      {
          String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case10.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case10.jsp");
        }
            else
        {
              
              qr="insert into chart values(?,'case10.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case10.jsp");
      }
          }
      
      
      
      
      
      
      else if(disease.equals("Obesity") && allergy.equals("Lime") && category.equals("Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
      {
          
       String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case11.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case11.jsp");
        }
            else
        {
              
              qr="insert into chart values(?,'case11.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case11.jsp");
      }
      }
        
      
      
      
      
      
      
       else if(disease.equals("Diabetes") && (allergy.equals("Lime")||allergy.equals("Milk Products")) && category.equals("Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
      {
          
          String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case12.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case12.jsp");
        }
            else
        {
          
              qr="insert into chart values(?,'case12.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case12.jsp");
      }
          }
          
          
          
          
          
          
          
      
      else if(disease.equals("Diabetes") && allergy.equals("Egg") && category.equals("Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
      {
             
          String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case13.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case13.jsp");
        }
            else
        {
          
              qr="insert into chart values(?,'case13.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case13.jsp");
      }
          }
          
          
          
          
          
          
          
          
          
      
       else if(disease.equals("Blood Pressure") && allergy.equals("Egg") && category.equals("Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
      {
          String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case14.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case14.jsp");
        }
            else
        {   
          
              qr="insert into chart values(?,'case14.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case14.jsp");
      }
          }
          
          
          
          
          
          
          
          
          
          
      
      else if(disease.equals("Blood Pressure") && allergy.equals("Milk") && category.equals("Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
      {
              
          String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case15.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case15.jsp");
        }
            else
        {
          
              qr="insert into chart values(?,'case15.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case15.jsp");
      }
          }
      

      
      
      
      
      
      
       else if((disease.equals("Blood Pressure") || disease.equals("Jaundice") || disease.equals("Obesity") || disease.equals("Typhoid") || disease.equals("Diabetes") || disease.equals("None")) && (allergy.equals("Lime") || allergy.equals("Egg") || allergy.equals("SeaFood") || allergy.equals("None")) && category.equals("Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("Pregnancy"))
      {
              
       String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case16.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case16.jsp");
        }
            else
        {
          
              qr="insert into chart values(?,'case16.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case16.jsp");
      }
          }

      
      
      
       
       
       
       
       else if((disease.equals("Blood Pressure") || disease.equals("Jaundice") || disease.equals("Obesity") || disease.equals("Typhoid") || disease.equals("Diabetes") || disease.equals("None")) && allergy.equals("Milk Products") && category.equals("Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("Pregnancy"))
      {
              
       String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
       rs=ps3.executeQuery();
       boolean b=rs.next();
        if(b==true)
        {
            
        String qr2;
        qr2="update chart set dietchart='case17.jsp' where email=?";
        PreparedStatement ps1=con.prepareStatement(qr2);
        ps1.setString(1,email);
        ps1.executeUpdate();
        response.sendRedirect("case17.jsp");
               
        }
            else
        {
          
              qr="insert into chart values(?,'case17.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case17.jsp");
      
        }
          }

       
       
       
       
       
       
       
      
       
       
       
       
       
       
      else if((disease.equals("Blood Pressure") || disease.equals("Jaundice") || disease.equals("Obesity") || disease.equals("Typhoid") || disease.equals("Diabetes") || disease.equals("None")) && (allergy.equals("None") || allergy.equals("Peanuts") || allergy.equals("Lime")) && category.equals("Non-Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("Pregnancy"))
      {
              
       String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case18.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case18.jsp");
        }
            else
        {
          
              qr="insert into chart values(?,'case18.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case18.jsp");
      }
          }

      
      
      
      
      
          
      else if((disease.equals("Blood Pressure") || disease.equals("Jaundice") || disease.equals("Obesity") || disease.equals("Typhoid") || disease.equals("Diabetes") || disease.equals("None")) && allergy.equals("SeaFood") && category.equals("Non-Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("Pregnancy"))
      {
              
       String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case19.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case19.jsp");
        }
            else
        {
          
              qr="insert into chart values(?,'case19.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case19.jsp");
      }
          }
    
          
          
      
      
      
      
      
          
          
          
     else if((disease.equals("Blood Pressure") || disease.equals("Jaundice") || disease.equals("Obesity") || disease.equals("Typhoid") || disease.equals("Diabetes") || disease.equals("None")) && allergy.equals("Egg") && category.equals("Non-Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("Pregnancy"))
      {
              
       String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case20.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case20.jsp");
        }
            else
        {
          
              qr="insert into chart values(?,'case20.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case20.jsp");
      }
          }
         
          
          
          
          
          
     else if((disease.equals("Blood Pressure") || disease.equals("Jaundice") || disease.equals("Obesity") || disease.equals("Typhoid") || disease.equals("Diabetes") || disease.equals("None")) && allergy.equals("Milk Products") && category.equals("Non-Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("Pregnancy"))
      {
              
       String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case21.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case21.jsp");
        }
            else
        {
          
              qr="insert into chart values(?,'case21.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case21.jsp");
      }
          }
          
          
          
          
          
          
          
     
          
          
          
          
          
          
          
          
     
     
     
      
      
      
      
      
      
      
      
      else if(disease.equals("Diabetes") && (allergy.equals("None")||allergy.equals("Lime")||allergy.equals("Milk")||allergy.equals("Peanut")) && category.equals("Non-Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
      {
          
          
          String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case22.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case22.jsp");
        }
            else
        {
              
              qr="insert into chart values(?,'case22.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case22.jsp");
      }
          }
          
          
          
          
          
          
          
          
          
      else if(disease.equals("Diabetes") && allergy.equals("SeaFood") && category.equals("Non-Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
      {
           String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case23.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case23.jsp");
        }
            else
        {   
          
              qr="insert into chart values(?,'case23.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case23.jsp");
      }
          }
      
      
      
      
      
      
      
      
      
      
      
      else if(disease.equals("Diabetes") && allergy.equals("Egg") && category.equals("Non-Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
      {
              
          String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case24.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case24.jsp");
        }
            else
        {
          
              qr="insert into chart values(?,'case24.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case24.jsp");
      }
          }
      
      
      
      
      
      
      
      else if(disease.equals("None") && allergy.equals("Egg") && category.equals("Non-Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
      {
          
          String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case25.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case25.jsp");
        }
            else
        {
          
              qr="insert into chart values(?,'case25.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case25.jsp");
      }
          }
      
      
      
      
      
      
     
       else if(disease.equals("None") && allergy.equals("Peanut") && category.equals("Non-Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
      {
          String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case26.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case26.jsp");
        }
            else
        {
              
              qr="insert into chart values(?,'case26.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case26.jsp");
      }
          }
     
          
          
          
          
          
          
          
          
        else if(disease.equals("None") && allergy.equals("Milk Products") && category.equals("Non-Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
      {
              String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case27.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case27.jsp");
        }
            else
        {
              qr="insert into chart values(?,'case27.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case27.jsp");
      }
          }
       
          
          
          
          
          
         else if(disease.equals("Blood Pressure") && (allergy.equals("None")||allergy.equals("Lime")||allergy.equals("SeaFood")||allergy.equals("Peanut")) && category.equals("Non-Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
         {
              
             String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case28.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case28.jsp");
        }
            else
        {
             
             
              qr="insert into chart values(?,'case28.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case28.jsp");
         
         }
          }
         
         
         
         
         
         
         
         
     else if(disease.equals("Blood Pressure") && allergy.equals("Milk Products") && category.equals("Non-Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
      {
              
          
          
          String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case29.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case29.jsp");
        }
            else
        {
          
          
              qr="insert into chart values(?,'case29.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case29.jsp");
      }
          }
          
          
          
          
          
          
          
     
     
     else if(disease.equals("Blood Pressure") && allergy.equals("Egg") && category.equals("Non-Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
      {
              
          
          String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case30.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case30.jsp");
        }
            else
        {
          
          
              qr="insert into chart values(?,'case30.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case30.jsp");
      }
          }
     
     
     
     
     
    else if(disease.equals("Obesity") && (allergy.equals("None")||allergy.equals("Peanut")) && category.equals("Non-Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
         {
              
             String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case31.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case31.jsp");
        }
            else
        {
             
             
              qr="insert into chart values(?,'case31.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case31.jsp");
         
         }
          }
          
          
          
          
          
          
        
    else if(disease.equals("Obesity") && allergy.equals("SeaFood") && category.equals("Non-Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
      {
              
          
          String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case32.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case32.jsp");
        }
            else
        {
          
          
              qr="insert into chart values(?,'case32.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case32.jsp");
      }
          }
          
          
          
          
          
          
          
          
    else if(disease.equals("Obesity") && allergy.equals("Milk Products") && category.equals("Non-Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
      {
              
          String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case33.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case33.jsp");
        }
            else
        {
          
              qr="insert into chart values(?,'case33.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case33.jsp");
      }
          }
          
          
          
          
          
          
          
     
    else if(disease.equals("Obesity") && allergy.equals("Lime") && category.equals("Non-Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
      {
              
          String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case34.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case34.jsp");
        }
            else
        {
          
              qr="insert into chart values(?,'case34.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case34.jsp");
      }
          }
          
          
          
          
          
          
          
    
    else if(disease.equals("Obesity") && allergy.equals("Egg") && category.equals("Non-Vegetarian") && (gender.equals("Female")||gender.equals("Male")) && other.equals("None"))
      {
          String email=(String)session.getAttribute("email");
       out.println(email);
       qr1="select * from chart where email=?";
       PreparedStatement ps3=con.prepareStatement(qr1);
       ps3.setString(1,email);
         rs=ps3.executeQuery();
         boolean b=rs.next();
        if(b==true)
        {
String qr2;
qr2="update chart set dietchart='case35.jsp' where email=?";
PreparedStatement ps1=con.prepareStatement(qr2);
ps1.setString(1,email);
ps1.executeUpdate();
response.sendRedirect("case35.jsp");
        }
            else
        {   
          
              qr="insert into chart values(?,'case35.jsp')";
              PreparedStatement ps=con.prepareStatement(qr);
              ps.setString(1,email);
              int n=ps.executeUpdate();
              response.sendRedirect("case35.jsp");
      }
          }
          
          
          
          
          
          
    
        
          else {
              response.sendRedirect("success.jsp");
        }
           }
          
           catch(Exception e){
           out.println(e);
           }
        
        
         }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(DietForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DietForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(DietForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DietForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
