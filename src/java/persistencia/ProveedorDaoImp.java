/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Proveedor;
import servicio.CompraServicio;
import servicio.CompraServicioImp;

/**
 *
 * @author sagit
 */
public class ProveedorDaoImp implements ProveedorDao {

    @Override
    public String grabar(Proveedor prov) {
        String sql = "insert into proveedor values('" + prov.getCod() + "','" + prov.getNom() + "','" + prov.getDir() + "')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public Proveedor buscar(String cod) {
        String sql = "select * from proveedor where codPro='" + cod + "'";
        Object[] fil = Operacion.buscar(sql);
        if (fil != null) {
            Proveedor pro = new Proveedor();
            pro.setCod(fil[0].toString());
            pro.setNom(fil[1].toString());
            pro.setDir(fil[2].toString());
            return pro;
        }
        return null;
    }

    @Override
    public List listar() {
        String sql = "select * from proveedor";
        List lis = Operacion.listar(sql);
        if (lis != null) {
            return lis;
        }
        return null;
    }

    @Override
    public Object[] buscarProveedor(String cod) {

        String sql = "select * from proveedor where codPro='" + cod + "'";
        return Operacion.buscar(sql);

    }

    /* probando el buscar proveedor
    public static void main(String[] args) {
        CompraServicio comSer = new CompraServicioImp();
        Object[] fil = comSer.buscarProveedor("P001");
        System.out.println(fil[0].toString()+" "+fil[1].toString());
    }
     */
}
