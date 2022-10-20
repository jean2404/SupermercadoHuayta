package negocio;

/**
 *
 * @author sagit
 */
public class LineaPedido {

    private Articulo art;
    int can;

    public double getImp() {
        double imp = 0;
        imp = art.getPre() * can;
        return imp;
    }

    public LineaPedido() {
    }

    public LineaPedido(Articulo art, int can) {
        this.art = art;
        this.can = can;
    }

    public Articulo getArt() {
        return art;
    }

    public void setArt(Articulo art) {
        this.art = art;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }

}
