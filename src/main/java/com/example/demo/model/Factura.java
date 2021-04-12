package com.example.demo.model;

public class Factura {
	
	private String facturaId;
	private String descripcion;
	private Float SubTotal;
	private Float Total;
	private String tipoPago;
	private String fecha;
	
	
	
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Float getSubTotal() {
		return SubTotal;
	}
	public void setSubTotal(Float subTotal) {
		SubTotal = subTotal;
	}
	public Float getTotal() {
		return Total;
	}
	public void setTotal(Float total) {
		Total = total;
	}

	public String getFacturaId() {
		return facturaId;
	}

	public void setFacturaId(String facturaId) {
		this.facturaId = facturaId;
	}
	
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;		
	}
	
	public String getTipoPago() {
		return tipoPago;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Factura [facturaId=" + facturaId + ", descripcion=" + descripcion + ", SubTotal=" + SubTotal
				+ ", Total=" + Total + ", tipoPago=" + tipoPago + ", fecha=" + fecha + "]";
	}
	
	
	
	
	

}
