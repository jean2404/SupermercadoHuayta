/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.List;

/**
 *
 * @author sagit
 */
public interface ArticuloServicio {

    public String grabar(String cod, String nom, double pre, int sto);

    public Object[] buscar(String cod);

    public List listar();

}
