/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import negocio.*;

/**
 *
 * @author sagit
 */
public class CompraDaoImp implements CompraDao{

    @Override
    public String grabar(Compra com) {
    
        String sql = "insert into compra values('" + com.getNum() + "','" + com.getFec() + "'," + com.getTot() + ",'" + com.getPro().getCod() + "','" + com.getEmp().getCod() + "')";
        return Operacion.ejecutar(sql);
        
    }
    
    /* Si graba, ya lo probe
    public static void main(String[] args) {
        Compra c = new Compra();
        c.setNum("C00015");
        c.setFec("14/04/2021");
        
        
        Articulo a = new Articulo("A001", "Jabon", 12);
        c.agregarLinea(a, 5);
        
        Proveedor p = new Proveedor();
        p.setCod("P004");
        
        c.setPro(p);
        
        Empleado e = new Empleado();
        e.setCod("E001");
        
        c.setEmp(e);
        
        String msg = new CompraDaoImp().grabar(c);
    }
    */
}
