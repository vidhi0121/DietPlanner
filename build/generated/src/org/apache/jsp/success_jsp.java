package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class success_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("    <title>Forgotten Password</title>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style>\n");
      out.write("            .forget{\n");
      out.write("     width:50%;\n");
      out.write("  background-color: whitesmoke;\n");
      out.write(" padding:15px;\n");
      out.write("    border:2px solid black;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".al{\n");
      out.write("    padding-left: 400px;\n");
      out.write("    padding-top: 280px;\n");
      out.write("    padding-bottom: 120px;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"al\">\n");
      out.write("        <div class=\"forget\" >\n");
      out.write("     <h2>FIND YOUR ACCOUNT</h2>\n");
      out.write("     <hr>\n");
      out.write("     <form action=\"forgotpassword\">\n");
      out.write("         <center>\n");
      out.write("        <table>\n");
      out.write("            <tr>  \n");
      out.write("                <td>Please enter your email address to </td>\n");
      out.write("                <td>search for your account</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"email\" name=\"email\" required/>\n");
      out.write("                </td>\n");
      out.write("               \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"submit\" value =\"Search\"/>\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                <a href=\"login.jsp\" style=\"text-decoration: none;\"><input type=\"button\" value=\"CANCEL\" \"/></a>\n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("         </center>\n");
      out.write("    </form>\n");
      out.write("     \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
