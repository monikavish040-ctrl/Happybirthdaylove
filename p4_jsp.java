package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class p4_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>surprise</title>\n");
      out.write("        <style>\n");
      out.write("        \n");
      out.write("             h1 {\n");
      out.write("          \n");
      out.write("                text-align: center;\n");
      out.write("                font-family: monotype corsiva;\n");
      out.write("                text-transform: capitalize;\n");
      out.write("                text-shadow: 10px 2px 10px white;\n");
      out.write("                font-size: 45px;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            h2{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("             h3{\n");
      out.write("                text-align: center;\n");
      out.write("                overflow: hidden;\n");
      out.write("                animation:  normal;\n");
      out.write("            }\n");
      out.write("             h4{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("     <body style=\"background-image: url('image/img7.jpg')\">\n");
      out.write("        <h1><mark> Happy birthday!🩷</mark></h1>\n");
      out.write("        <h3>\n");
      out.write("            On you b'day. I want to remind you how wonderful\n");
      out.write("            And special you are in mY life.<br>\n");
      out.write(" you deserve all the wonderful blessings and the most\n");
      out.write(" Beautiful<br> experiences\n");
      out.write(" to come a wonderful birthday.<br></h3>\n");
      out.write("\n");
      out.write("        <h3> Happy Birthday Mr.Innocent stranger💕...</h3> <h3>\n");
      out.write("            God makes your future bright💫 & Full fill your all Dreams...&<br>\n");
      out.write("            Make your life easy....<br>\n");
      out.write("            I LOVE YOU... I don't know how should 💖I express my Love <br>\n");
      out.write("            because my love for you is unlimited ...<br>\n");
      out.write("\n");
      out.write("            I love you. Alot more than my self..\n");
      out.write("            I never left you alone.<br>\n");
      out.write("            In any situation in any condition...\n");
      out.write("            You make me perfect...<br>\n");
      out.write("            You make me confident......<br>\n");
      out.write("            Thanks to come in my 😊life...<br></h3>\n");
      out.write("<h3>\n");
      out.write("    Your.. smile is my Power your voice is my favourite sound..💗<br> \n");
      out.write("    And aapki eyes uffff Inpr to hm pehle din se<br> fidaa hogye....🩷 \n");
      out.write("    On your birthday I just only want<br> aap khush rhe hmesha.........💖\n");
      out.write("    Ek baat or Jaan ha mana hm bahot <br>pareshan krte hai aapko \n");
      out.write("    galtiya bhi kar dete hai But<br>\n");
      out.write("    I really Love you meri jaan so much..<br>\n");
      out.write("    so I never forget you...❣️<br> \n");
      out.write("    And I never forget our wonderful time spend with eachother.<br>\n");
      out.write("    Many many happy returns of the day meri jaan...<br>\n");
      out.write("    I love you so much my Sweet heart❤️</h3>\n");
      out.write("        \n");
      out.write("        <h2>\n");
      out.write("            Happy Birthday!💖🩷\n");
      out.write("        </h2>\n");
      out.write("    <a href=\"memories.jsp\" ><h2><mark> TAP HERE TO SEE OUR MEMORIES</mark></h2></a>\n");
      out.write("             \n");
      out.write("     <audio controls>\n");
      out.write("        <source src=\"song/Chadeya.mp3\" type=\"audio/mp3\"></audio>           \n");
      out.write("        \n");
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
