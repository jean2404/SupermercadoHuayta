/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Proveedor;

/**
 *
 * @author sagit
 */
public interface ProveedorDao {

    public String grabar(Proveedor prov);

    public Proveedor buscar(String cod);

    public List listar();
    
    public Object[] buscarProveedor(String cod);
    
}
