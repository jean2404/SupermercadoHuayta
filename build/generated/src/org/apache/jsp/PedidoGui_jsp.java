package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import vista.PedidoPresentador;

public final class PedidoGui_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <style>@import\"Stilos.css\"</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            <p>Nota de Pedido</p>\n");
      out.write("            ");
 PedidoPresentador pedPre = (PedidoPresentador)session.getAttribute("pedPre"); 
      out.write("\n");
      out.write("            <table>\n");
      out.write("                ");
 Object[]f1=pedPre.getFil(); 
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>Numero</td><td><input type=\"text\" name=\"num\" size=\"20\" value=\"");
      out.print( f1[0] );
      out.write("\" /></td>  \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Fecha</td><td><input type=\"text\" name=\"fec\" size=\"20\" value=\"");
      out.print( f1[1] );
      out.write("\" /></td>  \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Empleado</td><td><input type=\"text\" name=\"cod\" size=\"20\" value=\"");
      out.print( f1[2] );
      out.write("\" /></td>  \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    ");
 List lis=pedPre.getLis(); 
      out.write("\n");
      out.write("                    <td>Codigo</td>\n");
      out.write("                    <td>Nombre</td>\n");
      out.write("                    <td>Precio</td>\n");
      out.write("                    <td>Cantidad</td>\n");
      out.write("                    <td>Importe</td>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 for (int i = 0; i < lis.size(); i++) {  
                
      out.write("\n");
      out.write("                ");
 Object[] f2 = (Object[])lis.get(i); 
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                <form action=\"PedidoControl\" method=\"post\">\n");
      out.write("                    <td><input type=\"text\" name=\"cod\" size=\"5\" value=\"");
      out.print( f2[0] );
      out.write("\" /></td>\n");
      out.write("                    <td><input type=\"text\" name=\"nom\" size=\"10\" value=\"");
      out.print( f2[1] );
      out.write("\" /></td>\n");
      out.write("                    <td><input type=\"text\" name=\"pre\" size=\"5\" value=\"");
      out.print( f2[2] );
      out.write("\" /></td>\n");
      out.write("                    <td><input type=\"text\" name=\"can\" size=\"5\" value=\"");
      out.print( f2[3] );
      out.write("\" /></td>\n");
      out.write("                    <td><input type=\"text\" name=\"imp\" size=\"5\" value=\"");
      out.print( f2[4] );
      out.write("\" /></td>\n");
      out.write("                    <td><input type=\"submit\" name=\"acc\" size=\"5\" value=\"Quitar\" /></td>\n");
      out.write("                </form>\n");
      out.write("                </tr>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </table>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <form action=\"PedidoControl\" method=\"post\">\n");
      out.write("                        <input type=\"submit\" name=\"acc\" value=\"Nuevo Pedido\" />\n");
      out.write("                        <input type=\"submit\" name=\"acc\" value=\"Mas Articulos\" />\n");
      out.write("                        </form>\n");
      out.write("                        </td>\n");
      out.write("                    <td>\n");
      out.write("                        Total==><input type=\"text\" name=\"tot\" size=\"5\" value=\"");
      out.print( f1[3] );
      out.write("\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("                    \n");
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
