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
public interface ClienteDao {

    public String grabar(Cliente cli);

    public Cliente buscar(String cod);

    public List listar();  
    
    public Object[] buscarCliente(String cod); //otra forma de buscar al cliente

}
