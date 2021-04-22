package cursoDAgil.bd.domain;

public class DetalleVentas {

	private Producto productoId;
	private Ventas venatId;
	private Integer cantidad;
	
	public Producto getProductoId() {
		return productoId;
	}
	public void setProductoId(Producto productoId) {
		this.productoId = productoId;
	}
	public Ventas getVenatId() {
		return venatId;
	}
	public void setVenatId(Ventas venatId) {
		this.venatId = venatId;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
}