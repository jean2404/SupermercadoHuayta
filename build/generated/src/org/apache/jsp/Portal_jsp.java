package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Portal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@100&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body{\n");
      out.write("                background-image: url(fondoSuper.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            img{\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("            .fondito{\n");
      out.write("                background-color: ghostwhite;\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("            .roboto{\n");
      out.write("                font-family: 'Roboto', sans-serif;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card mb-3 mx-auto\" style=\"max-width: 540px; top: 200px;\">\n");
      out.write("                <div class=\"row no-gutters\">\n");
      out.write("                    <div class=\"col-md-5\">\n");
      out.write("                        <img src=\"vendedor.jpg\" class=\"card-img\" alt=\"...\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-7\">\n");
      out.write("                        <div class=\"card-body fondito\">\n");
      out.write("                            <h5 class=\"card-title text-center roboto\" style=\"\n");
      out.write("                                font-size: 1.4rem;\">SISTEMA SUPERMERCADO</h5>\n");
      out.write("                            <a href=\"EmpleadoGui.jsp\" class=\"btn btn-outline-dark w-100 roboto\">Registro de Empleado</a>\n");
      out.write("                            <a href=\"ClienteGui.jsp\" class=\"btn btn-outline-dark w-100 roboto\">Registro de Cliente</a>\n");
      out.write("                            <a href=\"ProveedorGui.jsp\" class=\"btn btn-outline-dark w-100 roboto\">Registro de Proveedor</a>\n");
      out.write("                            <a href=\"Acceso.jsp\" class=\"btn btn-outline-dark w-100 roboto\">Acceso al Sistema - Empleado</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx\" crossorigin=\"anonymous\"></script>\n");
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
