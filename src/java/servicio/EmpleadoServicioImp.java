/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.List;
import negocio.Empleado;
import persistencia.*;

/**
 *
 * @author sagit
 */
public class EmpleadoServicioImp implements EmpleadoServicio{

    @Override
    public String grabar(String cod, String nom, String tip, String usu, String pas) {
        Empleado emp = new Empleado(cod, nom, tip, usu, pas);
        EmpleadoDao empDao = new EmpleadoDaoImp();
        String msg = empDao.grabar(emp);
        if (msg == null) {
            msg = "Empleado Grabado";
        }
        return msg;
    }

    @Override
    public Object[] validar(String usu, String pas) {
        EmpleadoDao empDao = new EmpleadoDaoImp();
        Empleado emp = empDao.validar(usu, pas);
        if (emp != null) {
            Object[] fil = new Object[2];
            fil[0] = emp.getCod();
            fil[1] = emp.getNom();
            return fil;
        }
        return null;
    }

    //metodo para buscar al empleado
    
    @Override
    public Object[] buscar(String cod) {
        Empleado emp = new EmpleadoDaoImp().buscar(cod);
        if (emp != null) {
            Object[] f = new Object[5];
            f[0] = emp.getCod();
            f[1] = emp.getNom();
            f[2] = emp.getTip();
            f[3] = emp.getUsu();
            f[4] = emp.getPas();
            return f;
        }
        return null;
    }
    
    @Override
    public List listar(){
        return new EmpleadoDaoImp().listar();   
    }
}
