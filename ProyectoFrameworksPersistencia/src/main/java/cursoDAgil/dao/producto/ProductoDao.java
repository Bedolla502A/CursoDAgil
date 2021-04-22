package cursoDAgil.dao.producto;

import java.util.List;

import cursoDAgil.bd.domain.Producto;


public interface ProductoDao {
	List<Producto> listarTodosProductos();
	void nuevoProducto(Producto producto);
	Producto obtenerProductoPorId(Producto idProducto);
	void actualizarProducto(Producto producto);
	List<Producto> obtenerProductosConMarca();
	void eliminarProducto(Producto idProducto);
}
