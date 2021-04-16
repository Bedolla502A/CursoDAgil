package cursoDAgil.bd.domain;

import java.util.Date;

public class Ganancias {
	private Integer idGanancia;
	private Integer ventaId;
	private Double totalGanancia;
	private Date fecha;
	public Integer getIdGanancia() {
		return idGanancia;
	}
	public void setIdGanancia(Integer idGanancia) {
		this.idGanancia = idGanancia;
	}
	public Integer getVentaId() {
		return ventaId;
	}
	public void setVentaId(Integer ventaId) {
		this.ventaId = ventaId;
	}
	public Double getTotalGanancia() {
		return totalGanancia;
	}
	public void setTotalGanancia(Double totalGanancia) {
		this.totalGanancia = totalGanancia;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
