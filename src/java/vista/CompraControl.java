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
@WebServlet(name = "CompraControl", urlPatterns = {"/CompraControl"})
public class CompraControl extends HttpServlet {

    private CompraPresentador comPre;
    private CompraServicio comSer;
    
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

        if (acc.equals("Nueva Compra")) {

            comPre = new CompraPresentador();
            comSer = new CompraServicioImp();
            String cod = request.getParameter("cod");
            Object[] fil = comSer.nuevaCompra(cod);
            comPre.setFil(fil);
            request.getSession().setAttribute("comPre", comPre);
            response.sendRedirect("CompraGui.jsp");

        }

        if (acc.equals("Mas Articulos")) {
            
            List lis=comSer.listarArticulo();
            comPre.setLis(lis);
            response.sendRedirect("ArticuloListar2.jsp");
            
        }

        if (acc.equals("Agregar Articulo")) {
            
            String cod = request.getParameter("cod");
            String nom = request.getParameter("nom");
            String pre = request.getParameter("pre");
            String can = request.getParameter("can");
            List lis = comSer.agregarArticulo(cod, nom, pre, can);
            comPre.setLis(lis);
            response.sendRedirect("CompraGui.jsp");
            
        }
        if (acc.equals("Quitar")) {
            
            String cod = request.getParameter("cod");
            List lis = comSer.quitarArticulo(cod);
            comPre.setLis(lis);
            response.sendRedirect("CompraGui.jsp");
            
        }
        
        if (acc.equals("Buscar")) {
            
            String cod = request.getParameter("codPro");
            Object[] fil = comSer.buscarProveedor(cod);
            if(fil != null){
                comPre.setFil2(fil);
            } else {
                comPre.setMsg("No existe el Proveedor en la BD");
            }
            response.sendRedirect("CompraGui.jsp");
            
        }
        
        if (acc.equals("Grabar")) {
            
            String cod = request.getParameter("codPro");
            String msg= comSer.grabarCompra(cod);
            comPre.setMsg(msg);
            response.sendRedirect("CompraGui.jsp");
            
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
