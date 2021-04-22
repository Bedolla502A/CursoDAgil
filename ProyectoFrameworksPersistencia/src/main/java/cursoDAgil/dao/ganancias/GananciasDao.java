package cursoDAgil.dao.ganancias;
import java.util.List;
import cursoDAgil.bd.domain.Ganancias;

public interface GananciasDao {
	List<Ganancias> obtenerGanancias();
	void nuevaGanancia(Ganancias ganancia);
	List<Ganancias> obtenerGananciasPorFecha(String fecha);
	Ganancias obtenerGananciasTotal();
}
