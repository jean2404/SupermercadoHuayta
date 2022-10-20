/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.List;
import negocio.Articulo;
import persistencia.*;

/**
 *
 * @author sagit
 */
public class ArticuloServicioImp implements ArticuloServicio {

    @Override
    public String grabar(String cod, String nom, double pre, int sto) {
        Articulo art = new Articulo(cod, nom, pre, sto);
        ArticuloDao artDao = new ArticuloDaoImp();
        String msg = artDao.grabar(art);
        if (msg == null) {
            msg = "Articulo Grabado";
        }
        return msg;
    }

    @Override
    public Object[] buscar(String cod) {
        Articulo art = new ArticuloDaoImp().buscar(cod);
        if (art != null) {
            Object[] f = new Object[4];
            f[0] = art.getCod();
            f[1] = art.getNom();
            f[2] = art.getPre();
            f[3] = art.getSto();
            return f;
        }
        return null;
    }

    @Override
    public List listar() {
        return new ArticuloDaoImp().listar();
    }

}
