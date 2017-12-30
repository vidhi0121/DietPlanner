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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author VIDHI RATHI
 */
public class DoctorForm extends HttpServlet {
    ResultSet rs;

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session=request.getSession();
       String Area=request.getParameter("Area");
       String Specialization=request.getParameter("category");
       session.setAttribute("Area",Area);
       session.setAttribute("Specialization",Specialization);
               
               
              
            try{
              Class.forName("com.mysql.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/diet","root","root");
              String qr="select * from docinfo where Area=? and Specialization=?";
       PreparedStatement ps=con.prepareStatement(qr);
    
         ps.setString(1,Area);
         ps.setString(2,Specialization);
         
        
         rs=ps.executeQuery();
         int i=1;
         while(rs.next())
       {
        
        String Name=rs.getString(3);
        String Address=rs.getString(4);
        String Timings=rs.getString(5);
        String Fees=rs.getString(6);
        String Contact=rs.getString(7);
        
        
        session.setAttribute("Name",Name);
        session.setAttribute("Address",Address);
        session.setAttribute("Timings",Timings);
        session.setAttribute("Fees",Fees);
        session.setAttribute("Contact",Contact);
        response.sendRedirect("displaydoc.jsp");
        
       }
        
        
        
        
       
            }
            catch(Exception e)
            {}        
        
        
        
        
        
        
        
        
        
        
        {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DoctorForm</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DoctorForm at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        processRequest(request, response);
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
        processRequest(request, response);
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
