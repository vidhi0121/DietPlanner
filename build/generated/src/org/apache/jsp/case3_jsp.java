package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class case3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Diet form</title>\n");
      out.write("        <style>\n");
      out.write("table {\n");
      out.write("    font-family: arial, sans-serif;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 95%;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("body{\n");
      out.write("    background-color: lightgray;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("td, th {\n");
      out.write("   \n");
      out.write("    border: 1px solid black;\n");
      out.write("    text-align: left;\n");
      out.write("    padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {\n");
      out.write("    background-color: #f2f2f2;\n");
      out.write("}\n");
      out.write("th\n");
      out.write("{\n");
      out.write("    background-color: black;\n");
      out.write("    color:white;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <a href=\"afterlogin.jsp\" class=\"w3-padding-large w3-hover-red w3-hide-small w3-right\">Home</a>\n");
      out.write("    <h1 align=\"center\">Diet Chart</h1>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("<table align=\"center\">\n");
      out.write("  <tr>\n");
      out.write("    <th>Timing</th>\n");
      out.write("    <th>Food item</th>\n");
      out.write("    <th>Quantity</th>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>Early Morning</td>\n");
      out.write("    <td>Soaked Almonds<br>or<br>Roasted Flex Seeds/Sunflower Seeds<br>Tea without sugar<br> Biscuits</td>\n");
      out.write("    <td>4<br><br>1 tsp<br>1 cup<br>2</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>Breakfast</td>\n");
      out.write("    <td>Stuffed Carrot/spinach paratha<br>Curd(without salt)<br>OR<br>Egg white omlette<br>Brown Bread/chapati</td>\n");
      out.write("    <td>2<br>1 cup<br><br>2 eggs<br>2/1</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>Mid morning</td>\n");
      out.write("    <td>Banana/Apple/Guava/Orange</td>\n");
      out.write("    <td>1</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>Lunch</td>\n");
      out.write("    <td>Veg brown rice pulav/Veg oat Upama<br>Cucumber,carrot,beetrooy,onion raita<br>Mix veg Salad<br>OR<br>Chapati<br>Capsicum/lady finger/torai/Bottle guard veg<br>Dal/drum stick sambar<br>Salad</td>\n");
      out.write("    <td>1 soup bowl<br>1 bowl<br>1 bowl<br><br>3 medium size<br>1 med bowl<br>1 med bowl<br>1 med bowl</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>Evening</td>\n");
      out.write("    <td>Green tea/Tea/Coffee(without sugar)<br>Puffed Rice(unsalted)/Watermelon</td>\n");
      out.write("    <td>1 cup<br>1 bowl</td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td>Dinner</td>\n");
      out.write("    <td>Chapati<br>Mix Veg/Drumstick/Palak veg <br>Curd/Kadhi/dal</td>\n");
      out.write("    <td>2<br>1 bowl<br>1 bowl</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
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
