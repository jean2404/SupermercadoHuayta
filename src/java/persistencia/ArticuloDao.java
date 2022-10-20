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
public interface ArticuloDao {

    public List listar();

    public String grabar(Articulo art);

    public Articulo buscar(String cod);
}
