package Suministrador;
import java.util.Scanner;
public class Tienda {
private String nombre;
	
	
	private String nombreProductos[]= new String[10];
	
	private int cantidadProductos[]=new int[10];
	
	private double importeTotal;


	public Tienda(String nombre) {
		this.nombre= nombre;
		
	}
	


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void rellenarNombres(int pos, String nombre) {
	
		this.nombreProductos[pos]= nombre;
		
	}



	public double getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(double importeTotal) {
		this.importeTotal = importeTotal;
	}

	public void mostrarTienda(int posicion) {
		System.out.println("");
		System.out.println("Tienda " + posicion + ": " + this.nombre);
	}
	
	
	
	public void meterProducto(int pos, int cantidad, double precio) {

		this.cantidadProductos[pos]= this.cantidadProductos[pos]+ cantidad;
		
		importeTotal = importeTotal + cantidad*precio;
		
	}
	
	public void mostrarInforme() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pulsa intro para ver los productos comprados por " + this.nombre);
		
		try {
			sc.hasNextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		System.out.println("Productos vendidos por "+ this.nombre);
		System.out.println();
		for (int i=0; i<cantidadProductos.length;  i++) {
			
			System.out.println(nombreProductos[i] + ": " + cantidadProductos[i]);		
		}
		System.out.println();
		System.out.println("Precio Total: " + this.importeTotal);
		System.out.println();
		
	}
	
	
	
}


