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
import java.sql.Statement;
import java.util.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import myconnection.Mycon;



/**
 *
 * @author VIDHI RATHI
 */
public class Register extends HttpServlet {

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
            throws ServletException, IOException, MessagingException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
           HttpSession session=request.getSession(); 
          
       
            
        
            String name=request.getParameter("name");
            String pass=request.getParameter("pass");
            String cpass=request.getParameter("cpass");
            String email=request.getParameter("email");
            String host ="smtp.gmail.com" ;
            String user = "befitvvvt12345@gmail.com";
            
            String from="befitvvvt12345@gmail.com";
            String passwrd="befit@123";
            String sub="To notify User";
            String mailtext="Dear User,Thankyou for registering on our website."
                    + "All the best and Happy Dieting..!!!"
                    + "REGARDS"
                    + "Befit Team";

            
            try {
   
              Class.forName("com.mysql.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/diet","root","root");
            
              
              Statement s=con.createStatement();
               ResultSet rs=s.executeQuery("select * from user where email="+"'"+email+"'");
               if(rs.next())
               {
                   out.println("<script type=\"text/javascript\">");
    out.println("alert('Registration Failed!!');");
   out.println("location='registration.jsp';");
   out.println("</script>");
                   }
              
             else
               {
              
            String qr= "insert into user values(?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(qr);
           
            
            ps.setString(1,name);
            ps.setString(2,pass);
           ps.setString(3,cpass);
           ps.setString(4,email);
           int n=ps.executeUpdate();
           if(n>0)
           
           {
        
               
               boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(email)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(sub); msg.setSentDate(new Date());
            msg.setText(mailtext);

           Transport transport=mailSession.getTransport("smtp");
           transport.connect(host, user, passwrd);
           transport.sendMessage(msg, msg.getAllRecipients());
           transport.close();
           
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Message send successsfully');");
            out.println("location='login.jsp';");
            out.println("</script>");      
       
            
               
               
               
               
           
   
            }
               }
            
      
    
               
           
           
           con.close();
          
            } 
           catch(ClassNotFoundException | SQLException e)
                {
                    System.out.println(e);
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

// </editor-fold>// </editor-fold>



            
            
            
            
            
            
            
            

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
        } catch (MessagingException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (MessagingException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
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
