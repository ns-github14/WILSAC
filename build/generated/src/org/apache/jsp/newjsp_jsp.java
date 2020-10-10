package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Montserrat\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<style>\n");
      out.write("body, h1,h2,h3,h4,h5,h6 {font-family: \"Montserrat\", sans-serif}\n");
      out.write(".w3-row-padding img {margin-bottom: 12px}\n");
      out.write("/* Set the width of the sidebar to 120px */\n");
      out.write(".w3-sidebar {width: 120px;background: #222;}\n");
      out.write("/* Add a left margin to the \"page content\" that matches the width of the sidebar (120px) */\n");
      out.write("#main {margin-left: 120px}\n");
      out.write("/* Remove margins from \"page content\" on small screens */\n");
      out.write("@media only screen and (max-width: 600px) {#main {margin-left: 0}}\n");
      out.write("</style>\n");
      out.write("<body class=\"w3-black\">\n");
      out.write("       <!-- Page Content -->\n");
      out.write("<div class=\"w3-padding-large\" id=\"main\">\n");
      out.write("  <!-- Header/Home -->\n");
      out.write("  <header class=\"w3-container w3-padding-32 w3-center w3-black\" id=\"home\">\n");
      out.write("    <h1 class=\"w3-jumbo\"><span class=\"w3-hide-small\">I'm</span> John Doe.</h1>\n");
      out.write("    <p>Photographer and Web Designer.</p>\n");
      out.write("    <img src=\"images/n.jpg\" alt=\"boy\" class=\"w3-image\" width=\"992\" height=\"1108\">\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("  <!-- About Section -->\n");
      out.write("  <div class=\"w3-content w3-justify w3-text-grey w3-padding-64\" id=\"about\">\n");
      out.write("    <h2 class=\"w3-text-light-grey\">My Name</h2>\n");
      out.write("    <hr style=\"width:200px\" class=\"w3-opacity\">\n");
      out.write("    <p>Some text about me. Some text about me. I am lorem ipsum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip\n");
      out.write("      ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur\n");
      out.write("      adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\n");
      out.write("    </p>\n");
      out.write("    <h3 class=\"w3-padding-16 w3-text-light-grey\">My Skills</h3>\n");
      out.write("    <p class=\"w3-wide\">Photography</p>\n");
      out.write("    <div class=\"w3-white\">\n");
      out.write("      <div class=\"w3-dark-grey\" style=\"height:28px;width:95%\"></div>\n");
      out.write("    </div>\n");
      out.write("    <p class=\"w3-wide\">Web Design</p>\n");
      out.write("    <div class=\"w3-white\">\n");
      out.write("      <div class=\"w3-dark-grey\" style=\"height:28px;width:85%\"></div>\n");
      out.write("    </div>\n");
      out.write("    <p class=\"w3-wide\">Photoshop</p>\n");
      out.write("    <div class=\"w3-white\">\n");
      out.write("      <div class=\"w3-dark-grey\" style=\"height:28px;width:80%\"></div>\n");
      out.write("    </div><br>\n");
      out.write("    \n");
      out.write("    <div class=\"w3-row w3-center w3-padding-16 w3-section w3-light-grey\">\n");
      out.write("      <div class=\"w3-quarter w3-section\">\n");
      out.write("        <span class=\"w3-xlarge\">11+</span><br>\n");
      out.write("        Partners\n");
      out.write("      </div>\n");
      out.write("      <div class=\"w3-quarter w3-section\">\n");
      out.write("        <span class=\"w3-xlarge\">55+</span><br>\n");
      out.write("        Projects Done\n");
      out.write("      </div>\n");
      out.write("      <div class=\"w3-quarter w3-section\">\n");
      out.write("        <span class=\"w3-xlarge\">89+</span><br>\n");
      out.write("        Happy Clients\n");
      out.write("      </div>\n");
      out.write("      <div class=\"w3-quarter w3-section\">\n");
      out.write("        <span class=\"w3-xlarge\">150+</span><br>\n");
      out.write("        Meetings\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <button class=\"w3-button w3-light-grey w3-padding-large w3-section\">\n");
      out.write("      <i class=\"fa fa-download\"></i> Download Resume\n");
      out.write("    </button>\n");
      out.write("    \n");
      out.write("    <!-- Grid for pricing tables -->\n");
      out.write("    <h3 class=\"w3-padding-16 w3-text-light-grey\">My Price</h3>\n");
      out.write("    <div class=\"w3-row-padding\" style=\"margin:0 -16px\">\n");
      out.write("      <div class=\"w3-half w3-margin-bottom\">\n");
      out.write("        <ul class=\"w3-ul w3-white w3-center w3-opacity w3-hover-opacity-off\">\n");
      out.write("          <li class=\"w3-dark-grey w3-xlarge w3-padding-32\">Basic</li>\n");
      out.write("          <li class=\"w3-padding-16\">Web Design</li>\n");
      out.write("          <li class=\"w3-padding-16\">Photography</li>\n");
      out.write("          <li class=\"w3-padding-16\">5GB Storage</li>\n");
      out.write("          <li class=\"w3-padding-16\">Mail Support</li>\n");
      out.write("          <li class=\"w3-padding-16\">\n");
      out.write("            <h2>$ 10</h2>\n");
      out.write("            <span class=\"w3-opacity\">per month</span>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"w3-light-grey w3-padding-24\">\n");
      out.write("            <button class=\"w3-button w3-white w3-padding-large w3-hover-black\">Sign Up</button>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"w3-half\">\n");
      out.write("        <ul class=\"w3-ul w3-white w3-center w3-opacity w3-hover-opacity-off\">\n");
      out.write("          <li class=\"w3-dark-grey w3-xlarge w3-padding-32\">Pro</li>\n");
      out.write("          <li class=\"w3-padding-16\">Web Design</li>\n");
      out.write("          <li class=\"w3-padding-16\">Photography</li>\n");
      out.write("          <li class=\"w3-padding-16\">50GB Storage</li>\n");
      out.write("          <li class=\"w3-padding-16\">Endless Support</li>\n");
      out.write("          <li class=\"w3-padding-16\">\n");
      out.write("            <h2>$ 25</h2>\n");
      out.write("            <span class=\"w3-opacity\">per month</span>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"w3-light-grey w3-padding-24\">\n");
      out.write("            <button class=\"w3-button w3-white w3-padding-large w3-hover-black\">Sign Up</button>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    <!-- End Grid/Pricing tables -->\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!-- Testimonials -->\n");
      out.write("    <h3 class=\"w3-padding-24 w3-text-light-grey\">My Reputation</h3>  \n");
      out.write("    <img src=\"/w3images/bandmember.jpg\" alt=\"Avatar\" class=\"w3-left w3-circle w3-margin-right\" style=\"width:80px\">\n");
      out.write("    <p><span class=\"w3-large w3-margin-right\">Chris Fox.</span> CEO at Mighty Schools.</p>\n");
      out.write("    <p>John Doe saved us from a web disaster.</p><br>\n");
      out.write("    \n");
      out.write("    <img src=\"/w3images/avatar_g2.jpg\" alt=\"Avatar\" class=\"w3-left w3-circle w3-margin-right\" style=\"width:80px\">\n");
      out.write("    <p><span class=\"w3-large w3-margin-right\">Rebecca Flex.</span> CEO at Company.</p>\n");
      out.write("    <p>No one is better than John Doe.</p>\n");
      out.write("  <!-- End About Section -->\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <!-- Portfolio Section -->\n");
      out.write("  <div class=\"w3-padding-64 w3-content\" id=\"photos\">\n");
      out.write("    <h2 class=\"w3-text-light-grey\">My Photos</h2>\n");
      out.write("    <hr style=\"width:200px\" class=\"w3-opacity\">\n");
      out.write("\n");
      out.write("    <!-- Grid for photos -->\n");
      out.write("    <div class=\"w3-row-padding\" style=\"margin:0 -16px\">\n");
      out.write("      <div class=\"w3-half\">\n");
      out.write("        <img src=\"/w3images/wedding.jpg\" style=\"width:100%\">\n");
      out.write("        <img src=\"/w3images/rocks.jpg\" style=\"width:100%\">\n");
      out.write("        <img src=\"/w3images/sailboat.jpg\" style=\"width:100%\">\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"w3-half\">\n");
      out.write("        <img src=\"/w3images/underwater.jpg\" style=\"width:100%\">\n");
      out.write("        <img src=\"/w3images/chef.jpg\" style=\"width:100%\">\n");
      out.write("        <img src=\"/w3images/wedding.jpg\" style=\"width:100%\">\n");
      out.write("        <img src=\"/w3images/p6.jpg\" style=\"width:100%\">\n");
      out.write("      </div>\n");
      out.write("    <!-- End photo grid -->\n");
      out.write("    </div>\n");
      out.write("  <!-- End Portfolio Section -->\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Contact Section -->\n");
      out.write("  <div class=\"w3-padding-64 w3-content w3-text-grey\" id=\"contact\">\n");
      out.write("    <h2 class=\"w3-text-light-grey\">Contact Me</h2>\n");
      out.write("    <hr style=\"width:200px\" class=\"w3-opacity\">\n");
      out.write("\n");
      out.write("    <div class=\"w3-section\">\n");
      out.write("      <p><i class=\"fa fa-map-marker fa-fw w3-text-white w3-xxlarge w3-margin-right\"></i> Chicago, US</p>\n");
      out.write("      <p><i class=\"fa fa-phone fa-fw w3-text-white w3-xxlarge w3-margin-right\"></i> Phone: +00 151515</p>\n");
      out.write("      <p><i class=\"fa fa-envelope fa-fw w3-text-white w3-xxlarge w3-margin-right\"> </i> Email: mail@mail.com</p>\n");
      out.write("    </div><br>\n");
      out.write("    <p>Let's get in touch. Send me a message:</p>\n");
      out.write("\n");
      out.write("    <form action=\"/action_page.php\" target=\"_blank\">\n");
      out.write("      <p><input class=\"w3-input w3-padding-16\" type=\"text\" placeholder=\"Name\" required name=\"Name\"></p>\n");
      out.write("      <p><input class=\"w3-input w3-padding-16\" type=\"text\" placeholder=\"Email\" required name=\"Email\"></p>\n");
      out.write("      <p><input class=\"w3-input w3-padding-16\" type=\"text\" placeholder=\"Subject\" required name=\"Subject\"></p>\n");
      out.write("      <p><input class=\"w3-input w3-padding-16\" type=\"text\" placeholder=\"Message\" required name=\"Message\"></p>\n");
      out.write("      <p>\n");
      out.write("        <button class=\"w3-button w3-light-grey w3-padding-large\" type=\"submit\">\n");
      out.write("          <i class=\"fa fa-paper-plane\"></i> SEND MESSAGE\n");
      out.write("        </button>\n");
      out.write("      </p>\n");
      out.write("    </form>\n");
      out.write("  <!-- End Contact Section -->\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("    <!-- Footer -->\n");
      out.write("  <footer class=\"w3-content w3-padding-64 w3-text-grey w3-xlarge\">\n");
      out.write("    <i class=\"fa fa-facebook-official w3-hover-opacity\"></i>\n");
      out.write("    <i class=\"fa fa-instagram w3-hover-opacity\"></i>\n");
      out.write("    <i class=\"fa fa-snapchat w3-hover-opacity\"></i>\n");
      out.write("    <i class=\"fa fa-pinterest-p w3-hover-opacity\"></i>\n");
      out.write("    <i class=\"fa fa-twitter w3-hover-opacity\"></i>\n");
      out.write("    <i class=\"fa fa-linkedin w3-hover-opacity\"></i>\n");
      out.write("    <p class=\"w3-medium\">Powered by <a href=\"https://www.w3schools.com/w3css/default.asp\" target=\"_blank\" class=\"w3-hover-text-green\">w3.css</a></p>\n");
      out.write("  <!-- End footer -->\n");
      out.write("  </footer>\n");
      out.write("\n");
      out.write("<!-- END PAGE CONTENT -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
