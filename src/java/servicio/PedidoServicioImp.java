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
import negocio.Articulo;
import negocio.Cliente;
import negocio.Empleado;
import negocio.LineaPedido;
import negocio.Pedido;
import persistencia.ArticuloDaoImp;
import persistencia.ClienteDaoImp;
import persistencia.PedidoDaoImp;

/**
 *
 * @author sagit
 */
public class PedidoServicioImp implements PedidoServicio {

    private Pedido ped;

    @Override
    public Object[] nuevoPedido(String cod) {
        ped = new Pedido();
        ped.setNum("P00001");
        ped.setFec(getFecha());
        Empleado emp = new Empleado();
        emp.setCod(cod);
        ped.setEmp(emp);
        return verPedido();

    }

    @Override
    public List agregarArticulo(String cod, String nom, String pre, String can) {
        Articulo art = new Articulo(cod, nom, Double.parseDouble(pre));
        ped.agregarLinea(art, Integer.parseInt(can));
        return verCesta();
    }

    @Override
    public List quitarArticulo(String cod) {
        ped.quitarLinea(cod);
        return verCesta();
    }

    private Object[] verPedido() {
        Object[] fil = new Object[4];
        fil[0] = ped.getNum();
        fil[1] = ped.getFec();
        fil[2] = ped.getTot();
        fil[3] = ped.getEmp().getCod();
        return fil;
    }

    private List verCesta() {
        List lis = new ArrayList();
        for (int i = 0; i < ped.getCes().size(); i++) {
            LineaPedido lin = (LineaPedido) ped.getCes().get(i);
            Object[] fil = new Object[6];
            fil[0] = lin.getArt().getCod();
            fil[1] = lin.getArt().getNom();
            fil[2] = lin.getArt().getPre();
            fil[3] = lin.getCan();
            fil[4] = lin.getImp();
            fil[5] = ped.getTot();
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
    public List listarArticulo() {
        return new ArticuloDaoImp().listar();
    }

    @Override
    public Object[] buscarCliente(String cod) {

        return new ClienteDaoImp().buscarCliente(cod);
    }

    @Override
    public String grabarPedido(String cod) {
        Cliente cli= new Cliente();
        cli.setCod(cod);
        ped.setCli(cli);
        String msg = new PedidoDaoImp().grabar(ped);
        if(msg==null){
         msg="Pedido Grabado";   
        }
        return msg;
    }

}
