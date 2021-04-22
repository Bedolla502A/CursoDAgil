package cursoDAgil.bd.mappers;

import java.util.List;

import cursoDAgil.bd.domain.Ganancias;

public interface GananciasMapper {
	List<Ganancias> obtenerGanancias();
	void nuevaGanancia(Ganancias ganancia);
	List<Ganancias> obtenerGananciasPorFecha(String fecha);
	Ganancias obtenerGananciasTotal();
}
 