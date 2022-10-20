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
import servicio.*;

/**
 *
 * @author sagit
 */
@WebServlet(name = "ClienteControl", urlPatterns = {"/ClienteControl"})
public class ClienteControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acc = request.getParameter("acc");
        if (acc.equals("Grabar")) {
            String cod = request.getParameter("codCli");
            String nom = request.getParameter("nom");
            String dir = request.getParameter("dir");

            String msg = new ClienteServicioImp().grabar(cod, nom, dir);

            request.getSession().setAttribute("msg", msg);
            response.sendRedirect("ClienteMensaje.jsp");
        }

        if (acc.equals("Buscar")) {

            String cod = request.getParameter("cod");
            ClienteServicio cliServicioImp = new ClienteServicioImp();
            Object[] f = cliServicioImp.buscar(cod);
            if (f != null) {
                request.getSession().setAttribute("f", f);
                response.sendRedirect("ClienteEditar.jsp");
            } else {
                request.getSession().setAttribute("msg", "No existe el cliente solicitado");
                response.sendRedirect("ClienteMensaje.jsp");
            }
        }

        if (acc.equals("Listar")) {
            List lis = new ClienteServicioImp().listar();
            request.getSession().setAttribute("lis", lis);
            response.sendRedirect("ClienteListar.jsp");
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
