package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bmrinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>BMRINFO Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body\n");
      out.write("        {\n");
      out.write("            background-color: burlywood;\n");
      out.write("            zoom: 175%;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <h1>CHARTS AND CALCULATORS</h1>\n");
      out.write("        <p>\n");
      out.write("            Do you know your Body Mass Index, your risk of heart disease or how much fat you are carrying? You can figure that out and learn more about your health.\n");
      out.write("We have a few easy to use health calculators that are based on tested formulas to help you assess your health online. Try a few out and see what it is all about.\n");
      out.write("Please note that the calculators are not intended to be a substitute for individual medical advice. Please consult with your doctor about your health concerns.\n");
      out.write("Basal Metabolic Rate is the number of calories you'd burn if you stayed in bed all day. It is the minimum calorific requirement needed to sustain life in a resting individual. You would have noticed that every year it becomes harder to eat whatever you want and stay slim. You have also heard that your BMR decreases as you age.\n");
      out.write("BMR is the largest factor in determining overall metabolic rate and how many calories you need to maintain, lose or gain weight.\n");
      out.write("Body mass index (BMI) is a measure of body fat based on height and weight that applies to adult men and women between the ages of 18 and 65 years. Although your BMI does not actually \"measure\" your percentage of body fat, it is a useful tool to estimate a healthy body weight based on your height. Your BMI \"number\" will inform you if you are underweight, of normal weight, overweight, or obese.\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("Below is the link for calculation of BMR/BMI.\n");
      out.write("\n");
      out.write("        </p>\n");
      out.write("        <a href=\"bmr.jsp\">BMR/BMI CALCULATOR</a>\n");
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
