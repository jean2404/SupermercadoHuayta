/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import negocio.Pedido;

/**
 *
 * @author sagit
 */
public class PedidoDaoImp implements PedidoDao {

    @Override
    public String grabar(Pedido ped) {

        String sql = "insert into pedido values('" + ped.getNum() + "','" + ped.getFec() + "'," + ped.getTot() + ",'" + ped.getCli().getCod() + "','" + ped.getEmp().getCod() + "')";
        return Operacion.ejecutar(sql);

    }

}
