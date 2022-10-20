/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.ArticuloServicio;
import servicio.ArticuloServicioImp;

/**
 *
 * @author sagit
 */
@WebServlet(name = "ArticuloControl", urlPatterns = {"/ArticuloControl"})
public class ArticuloControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acc = request.getParameter("acc");
        if (acc.equals("Grabar")) {
            String cod = request.getParameter("codArt");
            String nom = request.getParameter("nom");
            String pre = request.getParameter("pre");
            String sto = request.getParameter("sto");

            String msg = new ArticuloServicioImp().grabar(cod, nom, Double.parseDouble(pre), Integer.parseInt(sto));

            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("ClienteMensaje.jsp");
        }

        if (acc.equals("Buscar")) {

            String cod = request.getParameter("codArt");
            ArticuloServicio artServicioImp = new ArticuloServicioImp();
            Object[] f = artServicioImp.buscar(cod);
            if (f != null) {
                request.getSession().setAttribute("f", f);
                response.sendRedirect("ArticuloEditar.jsp");
            } else {
                request.getSession().setAttribute("msg", "No existe el articulo solicitado");
                response.sendRedirect("ArticuloMensaje.jsp");
            }
        }

        if (acc.equals("Listar")) {
            List lis = new ArticuloServicioImp().listar();
            request.getSession().setAttribute("lis", lis);
            response.sendRedirect("ArticuloListar3.jsp");
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
