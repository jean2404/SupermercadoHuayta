package servicio;

import java.util.List;
import negocio.Cliente;
import persistencia.ClienteDao;
import persistencia.ClienteDaoImp;

/**
 *
 * @author sagit
 */
public class ClienteServicioImp implements ClienteServicio {

    @Override
    public String grabar(String cod, String nom, String dir) {
        Cliente cli = new Cliente(cod, nom, dir);
        ClienteDao cliDao = new ClienteDaoImp();
        String msg = cliDao.grabar(cli);
        if (msg == null) {
            msg = "Cliente Grabado";
        }
        return msg;
    }

    @Override
    public Object[] buscar(String cod) {
        Cliente cli = new ClienteDaoImp().buscar(cod);
        if (cli != null) {
            Object[] f = new Object[3];
            f[0] = cli.getCod();
            f[1] = cli.getNom();
            f[2] = cli.getDir();
            return f;
        }
        return null;
    }

    @Override
    public List listar() {
        return new ClienteDaoImp().listar();
    }

}
