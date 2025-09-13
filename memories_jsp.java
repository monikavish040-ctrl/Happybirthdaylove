package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memories_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            div{\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("            }\n");
      out.write("            div img{\n");
      out.write("                width: 500px;\n");
      out.write("                height: 800px;\n");
      out.write("                border: 2px solid #2098d1;\n");
      out.write("                border-radius: 13px;\n");
      out.write("                box-shadow: 4px 7px 7px 0px #1b6d85;\n");
      out.write("                cursor: pointer;\n");
      out.write("                margin: 10px;\n");
      out.write("                transition: 400ms;\n");
      out.write("            }\n");
      out.write("            div img:hover {\n");
      out.write("                filter: grayscale(1);\n");
      out.write("                transform: scale(1.03);\n");
      out.write("              \n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                 text-align: center;\n");
      out.write("                font-family: monotype corsiva;\n");
      out.write("                text-transform: capitalize;\n");
      out.write("                text-shadow: 10px 2px 10px lightblue;\n");
      out.write("                font-size: 100px;\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background:url(image/img10.jpg)\">\n");
      out.write("        <h1>Picture Gallery</h1>\n");
      out.write("        <div>\n");
      out.write("            <img src=\"image/im4.jpg\" alt=\"\">\n");
      out.write("            <img src=\"image/im2.jpg\" alt=\"\">\n");
      out.write("            <img src=\"image/im14.jpg\" alt=\"\">\n");
      out.write("            <img src=\"image/im5.jpg\" alt=\"\">\n");
      out.write("            <img src=\"image/im6.jpg\" alt=\"\">\n");
      out.write("            <img src=\"image/im7.jpg\" alt=\"\">\n");
      out.write("            <img src=\"image/im8.jpg\" alt=\"\">\n");
      out.write("            <img src=\"image/im10.jpg\" alt=\"\">\n");
      out.write("            <img src=\"image/im11.jpg\" alt=\"\">\n");
      out.write("            <img src=\"image/im16.jpg\" alt=\"\">\n");
      out.write("            <img src=\"image/im3.jpg\" alt=\"\">\n");
      out.write("            <img src=\"image/im15.jpg\" alt=\"\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <h1>Once again\n");
      out.write("        </h1>\n");
      out.write("        <h1> Happy Birthday ❤️💫</h1>\n");
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
