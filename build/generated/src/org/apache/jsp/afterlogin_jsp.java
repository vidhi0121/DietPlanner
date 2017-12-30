package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class afterlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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


    String username=(String)session.getAttribute("name");
    String status=(String)session.getAttribute("status");
    if(status==null)
    {
        response.sendRedirect("login.jsp");
    }

      out.write("\n");
      out.write("<html>\n");
      out.write("<title>Afterlogin</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Lato\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<style>\n");
      out.write("body {font-family: \"Lato\", sans-serif}\n");
      out.write(".mySlides {display: none}\n");
      out.write("#quote{\n");
      out.write("    height:200px;\n");
      out.write("    text-align: center;\n");
      out.write("    }\n");
      out.write("   #q{\n");
      out.write("        font-family: \"Comic Sans MS\", cursive, sans-serif;\n");
      out.write("        text-align: center;\n");
      out.write("        font-size: 22px;\n");
      out.write("        color: black;\n");
      out.write("    }\n");
      out.write("     \n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("    <div id=\"quote\">\n");
      out.write("        \n");
      out.write("    <img src=\"befit.jpg\" style=\" align:left; width:350px;\">\n");
      out.write("    <span id=\"q\"><b>\"Dieting is the only game wh<font style=\"font-family: 'Comic Sans MS', cursive, sans-serif;color:#32CD32;\">ere you win when you lose!\"</font></b></span>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("    \n");
      out.write("<!-- Navbar -->\n");
      out.write("<div class=\"w3-top\">\n");
      out.write("  <div class=\"w3-bar w3-black w3-card-2\">\n");
      out.write("    <a class=\"w3-bar-item w3-button w3-padding-large w3-hide-medium w3-hide-large w3-right\" href=\"javascript:void(0)\" onclick=\"myFunction()\" title=\"Toggle Navigation Menu\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("    <a href=\"dietform.jsp\" class=\"w3-bar-item w3-button w3-padding-large\">GENERATE DIETCHART</a>\n");
      out.write("    <a href=\"AfterLogin\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">SHOW DIETCHART</a>\n");
      out.write("    <a href=\"#contact\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">CONTACT EXPERT</a>\n");
      out.write("    <a href=\"Logout\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">LOGOUT</a>\n");
      out.write("    <div class=\"w3-dropdown-hover w3-hide-small\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <a class=\"w3-padding-large w3-hover-red w3-hide-small w3-right\"><i class=\"fa fa-user-circle\" style=\"font-size:24px\"></i> Welcome ");
 out.print(username); 
      out.write("</a>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Navbar on small screens -->\n");
      out.write("<div id=\"navDemo\" class=\"w3-bar-block w3-black w3-hide w3-hide-large w3-hide-medium w3-top\" style=\"margin-top:46px\">\n");
      out.write("  <a href=\"#band\" class=\"w3-bar-item w3-button w3-padding-large\">BAND</a>\n");
      out.write("  <a href=\"#tour\" class=\"w3-bar-item w3-button w3-padding-large\">TOUR</a>\n");
      out.write("  <a href=\"#contact\" class=\"w3-bar-item w3-button w3-padding-large\">CONTACT</a>\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">MERCH</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Page content -->\n");
      out.write("<div class=\"w3-content\" style=\"max-width:2000px;margin-top:46px\">\n");
      out.write("\n");
      out.write("  <!-- Automatic Slideshow Images -->\n");
      out.write(" \n");
      out.write("\n");
      out.write("  <!-- The Band Section -->\n");
      out.write("  \n");
      out.write("  <!-- The Tour Section -->\n");
      out.write("  <div class=\"w3-black\" id=\"tour\">\n");
      out.write("    <div class=\"w3-container w3-content w3-padding-64\" style=\"max-width:800px\">\n");
      out.write("      <h2 class=\"w3-wide w3-center\"> OTHER SERVICES</h2>\n");
      out.write("      <p class=\"w3-opacity w3-center\"><i></i></p><br>\n");
      out.write("\n");
      out.write("      <ul class=\"w3-ul w3-border w3-white w3-text-grey\">\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("      <div class=\"w3-row-padding w3-padding-32\" style=\"margin:0 -16px\">\n");
      out.write("        <div class=\"w3-third w3-margin-bottom\">\n");
      out.write("            <a href=\"bmr.jsp\"> <img src=\"bmr1.jpg\" alt=\"Bmr/Bmi\" style=\"width:100%\" class=\"w3-hover-opacity\"></a>\n");
      out.write("          <div class=\"w3-container w3-white\">\n");
      out.write("            <p><b>BMR/BMI calculator</b></p>\n");
      out.write("            <p class=\"w3-opacity\"></p>\n");
      out.write("            <p>Through this module u can calculate your bmr and bmi.</p>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("          <div class=\"w3-third w3-margin-bottom\"></div>\n");
      out.write("        <div class=\"w3-third w3-margin-bottom\">\n");
      out.write("            <a href=\"doctorform.jsp\"><img src=\"docinfo.jpg\" alt=\"Doctor Information\" style=\"width:100%\" class=\"w3-hover-opacity\"></a>\n");
      out.write("          <div class=\"w3-container w3-white\">\n");
      out.write("            <p><b>Doctor Information</b></p>\n");
      out.write("            <p class=\"w3-opacity\"></p>\n");
      out.write("            <p>Through this module u can find out information of doctor.</p>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Ticket Modal -->\n");
      out.write("  <div id=\"ticketModal\" class=\"w3-modal\">\n");
      out.write("    <div class=\"w3-modal-content w3-animate-top w3-card-4\">\n");
      out.write("      <header class=\"w3-container w3-teal w3-center w3-padding-32\"> \n");
      out.write("        <span onclick=\"document.getElementById('ticketModal').style.display='none'\" \n");
      out.write("       class=\"w3-button w3-teal w3-xlarge w3-display-topright\">×</span>\n");
      out.write("        <h2 class=\"w3-wide\"><i class=\"fa fa-suitcase w3-margin-right\"></i>Tickets</h2>\n");
      out.write("      </header>\n");
      out.write("      <div class=\"w3-container\">\n");
      out.write("        <p><label><i class=\"fa fa-shopping-cart\"></i> Tickets, $15 per person</label></p>\n");
      out.write("        <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"How many?\">\n");
      out.write("        <p><label><i class=\"fa fa-user\"></i> Send To</label></p>\n");
      out.write("        <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Enter email\">\n");
      out.write("        <button class=\"w3-button w3-block w3-teal w3-padding-16 w3-section w3-right\">PAY <i class=\"fa fa-check\"></i></button>\n");
      out.write("        <button class=\"w3-button w3-red w3-section\" onclick=\"document.getElementById('ticketModal').style.display='none'\">Close <i class=\"fa fa-remove\"></i></button>\n");
      out.write("        <p class=\"w3-right\">Need <a href=\"#\" class=\"w3-text-blue\">help?</a></p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- The Contact Section -->\n");
      out.write("  <div class=\"w3-container w3-content w3-padding-64\" style=\"max-width:800px\" id=\"contact\">\n");
      out.write("    <h2 class=\"w3-wide w3-center\">CONTACT AN EXPERT</h2>\n");
      out.write("    <p class=\"w3-opacity w3-center\"><i>If you have any queries regarding health feel free to contact us!</i></p>\n");
      out.write("    <div class=\"w3-row w3-padding-32\">\n");
      out.write("        <div class=\"w3-col m6 w3-large w3-margin-bottom\">\n");
      out.write("        <i class=\"fa fa-map-marker\" style=\"width:30px\"></i> Indore, India<br>\n");
      out.write("        <i class=\"fa fa-phone\" style=\"width:30px\"></i> Phone: +00 151515<br>\n");
      out.write("        <i class=\"fa fa-envelope\" style=\"width:30px\"> </i> Email: mail@mail.com<br>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"w3-col m6 w3-large w3-margin-bottom\">\n");
      out.write("        </div>\n");
      out.write("      <div class=\"w3-col m6\">\n");
      out.write("        <form action=\"ExpertContact\" method=\"post\">\n");
      out.write("          <div class=\"w3-row-padding\" style=\"margin:0 -16px 8px -16px\">\n");
      out.write("            <div class=\"w3-half\">\n");
      out.write("              <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Name\" required name=\"Name\">\n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("            <div class=\"w3-half\">\n");
      out.write("              <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Email\" required name=\"Email\">\n");
      out.write("              \n");
      out.write("            </div><div class=\"w3-half\">\n");
      out.write("                <div style=\"height:6px\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("              <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Password\" required name=\"passwrd\">\n");
      out.write("            </div>\n");
      out.write("              \n");
      out.write("          </div>\n");
      out.write("          <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Message\" required name=\"message\">\n");
      out.write("          <button class=\"w3-button w3-black w3-section w3-right\" type=\"submit\">SEND</button>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("<!-- End Page Content -->\n");
      out.write("</div>\n");
      out.write("<!-- Add Google Maps -->\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function myMap() {\n");
      out.write("  myCenter=new google.maps.LatLng(41.878114, -87.629798);\n");
      out.write("  var mapOptions= {\n");
      out.write("    center:myCenter,\n");
      out.write("    zoom:12, scrollwheel: false, draggable: false,\n");
      out.write("    mapTypeId:google.maps.MapTypeId.ROADMAP\n");
      out.write("  };\n");
      out.write("  var map=new google.maps.Map(document.getElementById(\"googleMap\"),mapOptions);\n");
      out.write("\n");
      out.write("  var marker = new google.maps.Marker({\n");
      out.write("    position: myCenter,\n");
      out.write("  });\n");
      out.write("  marker.setMap(map);\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBu-916DdpKAjTmJNIgngS6HL_kDIKU0aU&callback=myMap\"></script>\n");
      out.write("<!--\n");
      out.write("To use this code on your website, get a free API key from Google.\n");
      out.write("Read more at: https://www.w3schools.com/graphics/google_maps_basic.asp\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"w3-container w3-padding-64 w3-center w3-opacity w3-light-grey w3-xlarge\">\n");
      out.write("  <i class=\"fa fa-facebook-official w3-hover-opacity\"></i>\n");
      out.write("  <i class=\"fa fa-instagram w3-hover-opacity\"></i>\n");
      out.write("  <i class=\"fa fa-snapchat w3-hover-opacity\"></i>\n");
      out.write("  <i class=\"fa fa-pinterest-p w3-hover-opacity\"></i>\n");
      out.write("  <i class=\"fa fa-twitter w3-hover-opacity\"></i>\n");
      out.write("  <i class=\"fa fa-linkedin w3-hover-opacity\"></i>\n");
      out.write("  <p class=\"w3-medium\">Powered by <a href=\"https://www.w3schools.com/w3css/default.asp\" target=\"_blank\">Medicaps University</a></p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("// Automatic Slideshow - change image every 4 seconds\n");
      out.write("var myIndex = 0;\n");
      out.write("carousel();\n");
      out.write("\n");
      out.write("function carousel() {\n");
      out.write("    var i;\n");
      out.write("    var x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("    for (i = 0; i < x.length; i++) {\n");
      out.write("       x[i].style.display = \"none\";  \n");
      out.write("    }\n");
      out.write("    myIndex++;\n");
      out.write("    if (myIndex > x.length) {myIndex = 1}    \n");
      out.write("    x[myIndex-1].style.display = \"block\";  \n");
      out.write("    setTimeout(carousel, 4000);    \n");
      out.write("}\n");
      out.write("\n");
      out.write("// Used to toggle the menu on small screens when clicking on the menu button\n");
      out.write("function myFunction() {\n");
      out.write("    var x = document.getElementById(\"navDemo\");\n");
      out.write("    if (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("        x.className += \" w3-show\";\n");
      out.write("    } else { \n");
      out.write("        x.className = x.className.replace(\" w3-show\", \"\");\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("// When the user clicks anywhere outside of the modal, close it\n");
      out.write("var modal = document.getElementById('ticketModal');\n");
      out.write("window.onclick = function(event) {\n");
      out.write("  if (event.target == modal) {\n");
      out.write("    modal.style.display = \"none\";\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
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
