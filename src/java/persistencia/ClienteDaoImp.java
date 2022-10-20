/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Cliente;

/**
 *
 * @author sagit
 */
public class ClienteDaoImp implements ClienteDao {

    @Override
    public String grabar(Cliente cli) {
        String sql = "insert into cliente values('" + cli.getCod() + "','" + cli.getNom() + "','" + cli.getDir() + "')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public Cliente buscar(String cod) {
        String sql = "select * from cliente where codCli='" + cod + "'";
        Object[] fil = Operacion.buscar(sql);
        if (fil != null) {
            Cliente cli = new Cliente();
            cli.setCod(fil[0].toString());
            cli.setNom(fil[1].toString());
            cli.setDir(fil[2].toString());
            return cli;
        }
        return null;
    }

    @Override
    public List listar() {
        String sql = "select * from cliente";
        List lis = Operacion.listar(sql);
        if (lis != null) {
            return lis;
        }
        return null;
    }

    @Override
    public Object[] buscarCliente(String cod) {
        String sql = "select * from cliente where codCli='" + cod + "'";
        return Operacion.buscar(sql);
    }

}
