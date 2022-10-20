package servicio;

import java.util.List;

/**
 *
 * @author sagit
 */
public interface PedidoServicio {

    public Object[] nuevoPedido(String cod);

    public List agregarArticulo(String cod, String nom, String pre, String can);

    public List quitarArticulo(String cod);
    
    public List listarArticulo();
    
    public Object[] buscarCliente(String cod);
    
    public String grabarPedido(String cod);
}
