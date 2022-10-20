package persistencia;

import java.util.List;
import negocio.Empleado;

public interface EmpleadoDao {
    public String grabar(Empleado emp);
    public String actualizar(Empleado emp);
    public String eliminar(Empleado emp);
    public Empleado buscar(String cod);
    public List listar();
    public Empleado validar(String usu, String pas);
}
