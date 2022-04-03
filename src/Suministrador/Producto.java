package Suministrador;

public class Producto {
	
	private String nombre;
	private double precio;
	private int cantidadTotal;
	
	private Tienda tiendaEspecial;

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadTotal() {
		return cantidadTotal;
	}

	public void setCantidadTotal(int cantidadTotal) {
		this.cantidadTotal = cantidadTotal;
	}
	 
	
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio= precio;
	}

	

		
	void meterCantidad(int cantidad) {
		
		this.cantidadTotal= this.cantidadTotal+cantidad;

	}
	
		
		
		
}


