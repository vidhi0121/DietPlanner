package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dietform_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<style>\n");
      out.write("input[type=text], select {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("    width: 100%;\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("    background-color: #45a049;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("    background-color: #f2f2f2;\n");
      out.write("    align:center;\n");
      out.write("}\n");
      out.write("h3{\n");
      out.write("    margin-bottom: 5px;\n");
      out.write("}\n");
      out.write("div {\n");
      out.write("    border-radius: 5px;\n");
      out.write("    background-color: #f2f2f2;\n");
      out.write("    padding: 20px;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write(".header{\n");
      out.write("    background-color: white;\n");
      out.write("    height:180px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("    <div class=\"header\">\n");
      out.write("     <img src=\"befit.jpg\" align=\"bottom\" style=\"width:400px; height:180px;\"> \n");
      out.write("    </div>\n");
      out.write("    <h3 align=\"center\" style=\"font-size:25px\"><strong>Dietform Details</strong></h3>\n");
      out.write("    <h4 align=\"center\">Insert the following details to generate dietchart.</h4>\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("    <form action=\"DietForm\" method=\"post\">\n");
      out.write("        <table align=\"center\" cellspacing=\"10\">\n");
      out.write("            <tr>\n");
      out.write("                <th align=\"left\">Gender</th>\n");
      out.write("                <th align=\"left\">Diseases</th>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><select name=\"Gender\" required><option>Select Gender</option><option>Female</option><option>Male</option></select></td>\n");
      out.write("                <td><select name=\"Disease\" required><option>Diseases if any</option><option>Obesity</option><option>Jaundice</option><option>Diabetes</option><option>Typhoid</option><option>Blood Pressure</option><option>None</option></select></td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("               <th align=\"left\">Other Conditions</th> \n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><select name=\"Other\" required><option>Other Conditions</option><option>Pregnancy</option><option>None</option></select></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th align=\"left\">Allergy</th>\n");
      out.write("                <th align=\"left\">Category</th>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                 <td><select name=\"Allergy\" required><option>Allergy if any</option><option>SeaFood</option><option>Milk Products</option><option>Peanut</option><option>Egg</option><option>Lime</option></select></td>\n");
      out.write("                 <td><select name=\"category\" required><option>Select Category</option><option>Vegetarian</option><option>Non-Vegetarian</option></select></td>\n");
      out.write("</td>\n");
      out.write("             </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th colspan=\"2\"><input type=\"submit\" value=\"Calculate\"/></th>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("         </form>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
