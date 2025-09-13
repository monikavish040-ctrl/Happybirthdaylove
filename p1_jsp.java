package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class p1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Happy Birthday</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <style>\n");
      out.write("           \n");
      out.write("\n");
      out.write("            h1 {\n");
      out.write("                \n");
      out.write("                text-align: center;\n");
      out.write("                font-family: monotype corsiva;\n");
      out.write("                text-transform: capitalize;\n");
      out.write("                text-shadow: 10px 2px 10px black;\n");
      out.write("                font-size: 45px;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            h2 {\n");
      out.write("                \n");
      out.write("                text-align: center;\n");
      out.write("                text-transform:fullsize-kana;\n");
      out.write("                text-shadow: 10px 2px 10px springgreen;\n");
      out.write("                font-size: 45px;\n");
      out.write("                color: blueviolet;\n");
      out.write("            }\n");
      out.write("             h3 {\n");
      out.write("                \n");
      out.write("               text-align: center;\n");
      out.write("                overflow: hidden;\n");
      out.write("                animation:  normal;\n");
      out.write("                 font-family:  corsiva;\n");
      out.write("                 color: black;\n");
      out.write("            }\n");
      out.write("            h4 {\n");
      out.write("                \n");
      out.write("                text-align: center;\n");
      out.write("                text-transform:none;\n");
      out.write("                text-shadow: 10px 2px 10px red;\n");
      out.write("                font-size: 100px;\n");
      out.write("                color: red;\n");
      out.write("                backface-visibility: visible;\n");
      out.write("                button-padding:10%;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("           \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url('image/img10.jpg')\">\n");
      out.write("        \n");
      out.write("              \n");
      out.write("                <!-- Header with title -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <h1>Happy birthday</h1>\n");
      out.write("                <h2> Wishing you a wonderful day filled with love,laughter,and cake!</h2>\n");
      out.write("            \n");
      out.write("            <h3> Why do I prefer<br> I Love you more?🩷💕<br>\n");
      out.write("            Because...I love you more than I <br>\n");
      out.write("            said,<br>\n");
      out.write("            I love you more than you know,💖<br>\n");
      out.write("            I love you more when your<br>\n");
      out.write("            day did't go so well,<br>\n");
      out.write("            I love you more when you cried,<br>\n");
      out.write("            I love you more at your lowest,<br>\n");
      out.write("            and I love you in every situation❣️<br>\n");
      out.write("            😍🩷❤️💗💖💫</h3>\n");
      out.write("                        </div>\n");
      out.write("                                    \n");
      out.write("                            </div>\n");
      out.write("                            <h1>Touch the heart</h1><br>\n");
      out.write("                            <a href=\"p2.jsp\" ><h4>❤❤❤❤</h4></a>\n");
      out.write("                        \n");
      out.write("                           \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("\n");
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
