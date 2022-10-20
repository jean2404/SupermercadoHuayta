/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sagit
 */
public class Compra {
    
    private String num, fec;
    private Proveedor pro;
    private Empleado emp;
    private List ces = new ArrayList();

    public void agregarLinea(Articulo art, int can) {
        LineaCompra lin = new LineaCompra(art, can);
        ces.add(lin);
    }

    public void quitarLinea(String cod) {
        for (int i = 0; i < ces.size(); i++) {
            LineaCompra lin = (LineaCompra) ces.get(i);
            if (lin.getArt().getCod().equals(cod)) {
                ces.remove(i);
            }
        }
    }

    public double getTot() {
        double tot = 0;
        for (int i = 0; i < ces.size(); i++) {
            LineaCompra lin = (LineaCompra) ces.get(i);
            tot += lin.getImp();
        }
        return tot;
    }

    public List getCes() {
        return ces;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getFec() {
        return fec;
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public Proveedor getPro() {
        return pro;
    }

    public void setPro(Proveedor pro) {
        this.pro = pro;
    }

    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }
    
}
