/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import negocio.*;
import persistencia.ArticuloDaoImp;
import persistencia.CompraDaoImp;
import persistencia.ProveedorDaoImp;

/**
 *
 * @author sagit
 */
public class CompraServicioImp implements CompraServicio {

    private Compra com;

    @Override
    public Object[] nuevaCompra(String cod) {

        com = new Compra();
        com.setNum("C00001");
        com.setFec(getFecha());
        Empleado emp = new Empleado();
        emp.setCod(cod);
        com.setEmp(emp);
        return verCompra();

    }

    private Object[] verCompra() {
        Object[] fil = new Object[4];
        fil[0] = com.getNum();
        fil[1] = com.getFec();
        fil[2] = com.getTot();
        fil[3] = com.getEmp().getCod();
        return fil;
    }

    private List verCesta() {
        List lis = new ArrayList();
        for (int i = 0; i < com.getCes().size(); i++) {
            LineaCompra lin = (LineaCompra) com.getCes().get(i);
            Object[] fil = new Object[6];
            fil[0] = lin.getArt().getCod();
            fil[1] = lin.getArt().getNom();
            fil[2] = lin.getArt().getPre();
            fil[3] = lin.getCan();
            fil[4] = lin.getImp();
            fil[5] = com.getTot();
            lis.add(fil);
        }

        return lis;
    }

    private String getFecha() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(d);
    }

    @Override
    public List agregarArticulo(String cod, String nom, String pre, String can) {

        Articulo art = new Articulo(cod, nom, Double.parseDouble(pre));
        com.agregarLinea(art, Integer.parseInt(can));
        return verCesta();

    }

    @Override
    public List quitarArticulo(String cod) {

        com.quitarLinea(cod);
        return verCesta();

    }

    @Override
    public List listarArticulo() {

        return new ArticuloDaoImp().listar();

    }

    @Override
    public Object[] buscarProveedor(String cod) {

        return new ProveedorDaoImp().buscarProveedor(cod);

    }

    @Override
    public String grabarCompra(String cod) {

        Proveedor pro = new Proveedor();
        pro.setCod(cod);
        com.setPro(pro);
        String msg = new CompraDaoImp().grabar(com);
        if (msg == null) {
            msg = "Compra Grabada";
        }
        return msg;

    }

}
