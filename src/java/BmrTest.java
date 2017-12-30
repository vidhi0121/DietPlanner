/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author VIDHI RATHI
 */
public class BmrTest extends HttpServlet {

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
        
        
        String gender=request.getParameter("Gender");
        String wt =request.getParameter("wt");
        String ht=request.getParameter("ht");
        String age=request.getParameter("age");
        double wt1=Double.parseDouble(wt);
        double ht1=Double.parseDouble(ht);
        double age1=Double.parseDouble(age);
        session.setAttribute("gender",gender);
       
        
        double bmrm;
        double bmrf;
        double bmi;
               
         if(gender.equals("Male"))
        {
            
            bmrm=66.5+(13.75*wt1)+(5.003*0.033*ht1)-(6.755*age1);
            bmi=wt1/(ht1*ht1*3.3*3.3);
           session.setAttribute("bmrm",bmrm);
            session.setAttribute("bmi",bmi);
            response.sendRedirect("bmrsuccess.jsp");
            
        }
        else
        {
            bmrf=655.1+(9.563*wt1)+(1.850*0.33*ht1)-(4.676*age1);
             bmi=wt1/(ht1*ht1*3.3*3.3);
            session.setAttribute("bmrf",bmrf);
            session.setAttribute("bmi",bmi);
            response.sendRedirect("bmrsuccess.jsp");
            
        }
         
        
             
        
        {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BmrTest</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BmrTest at " + request.getContextPath() + "</h1>");
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
