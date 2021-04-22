package cursoDAgil.bd.mappers;

import java.util.List;
import cursoDAgil.bd.domain.Marcas;

public interface MarcaMapper {
	List<Marcas> obtenerMarcas();
	Integer nuevaMarca(Marcas marcas);
	Marcas obtenerDireccionPorId(Marcas marcas);
	void actualizarMarca(Marcas marcas);
	void eliminarMarca(Marcas idMarca);
}
