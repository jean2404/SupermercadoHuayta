/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Articulo;

/**
 *
 * @author sagit
 */
public class ArticuloDaoImp implements ArticuloDao {

    @Override
    public List listar() {
        return Operacion.listar("select * from articulo");
    }

    @Override
    public String grabar(Articulo art) {
        String sql = "insert into articulo values('" + art.getCod() + "','" + art.getNom() + "'," + art.getPre() + "," + art.getSto() + ")";
        return Operacion.ejecutar(sql);
    }

    @Override
    public Articulo buscar(String cod) {

        String sql = "select * from articulo where codArt='" + cod + "'";
        Object[] fil = Operacion.buscar(sql);
        if (fil != null) {
            Articulo art = new Articulo();
            art.setCod(fil[0].toString());
            art.setNom(fil[1].toString());
            art.setPre(Double.parseDouble(fil[2].toString()));
            art.setSto(Integer.parseInt(fil[3].toString()));
            return art;
        }
        return null;

    }

    /* si funciona
    public static void main(String[] args) {
        Articulo a = new Articulo("a4", "art1", 15, 10);
        String m = new ArticuloDaoImp().grabar(a);
        System.out.println(m);
    }
     */
}
