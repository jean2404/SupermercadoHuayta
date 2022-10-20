/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.List;
import negocio.Proveedor;
import persistencia.ProveedorDao;
import persistencia.ProveedorDaoImp;

/**
 *
 * @author sagit
 */
public class ProveedorServicioImp implements ProveedorServicio{

    public String grabar(String cod, String nom, String dir) {
        Proveedor prov = new Proveedor(cod, nom, dir);
        ProveedorDao provDao = new ProveedorDaoImp();
        String msg = provDao.grabar(prov);
        if (msg == null) {
            msg = "Proveedor Grabado";
        }
        return msg;
    }
    
        @Override
    public Object[] buscar(String cod) {
        Proveedor pro = new ProveedorDaoImp().buscar(cod);
        if (pro != null) {
            Object[] f = new Object[3];
            f[0] = pro.getCod();
            f[1] = pro.getNom();
            f[2] = pro.getDir();
            return f;
        }
        return null;
    }

    @Override
    public List listar() {
        return new ProveedorDaoImp().listar();
    }

}
