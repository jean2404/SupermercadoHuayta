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
public interface ClienteServicio {

    public String grabar(String cod, String nom, String dir);

    public Object[] buscar(String cod);

    public List listar();
}
