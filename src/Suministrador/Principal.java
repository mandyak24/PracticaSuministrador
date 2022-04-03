package Suministrador;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tienda tienda1 = new Tienda("Carrefour");
		Tienda tienda2 = new Tienda("Dia");
		Tienda tienda3 = new Tienda("Mercadona");
		Tienda tienda4 = new Tienda("Lidl");
		Tienda tienda5 = new Tienda("Aldi");
		
		//Array tiendas
		Tienda[] arrayTiendas = {tienda1, tienda2, tienda3, tienda4, tienda5};
		
		Producto producto1 = new Producto("pan", 0.8);
		Producto producto2 = new Producto("leche", 1.2);
		Producto producto3 = new Producto("cafe", 4.5);
		Producto producto4 = new Producto("cerveza", 0.65);
		Producto producto5 = new Producto("manzana", 2.2);
		Producto producto6 = new Producto("pera", 2);
		Producto producto7 = new Producto("platano", 2.3);
		Producto producto8 = new Producto("detergente", 6.8);
		Producto producto9 = new Producto("yogur", 2.5);
		Producto producto10 = new Producto("jamon", 14.5);
		
		//Array productos
		Producto[] arrayProductos = {producto1, producto2, producto3, producto4, producto5,
									 producto6, producto7, producto8, producto9, producto10};
		
	
		
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		

		
		// Le paso el nombre de los productos a las tiendas
		for (Tienda tienda: arrayTiendas) {
			for (int j=0; j<arrayProductos.length; j++) {	
				tienda.rellenarNombres(j, arrayProductos[j].getNombre());
			}
		}
		

		
		int producto=0;
		int cantidad=0;
		String pregunta="";
		
		do {	
		
			for (Tienda tienda : arrayTiendas) {
				System.out.println(tienda.getNombre());;

			
				do {
					System.out.println();
					System.out.println("¿Que producto desea (1-10)?");
					try {
						producto = teclado.nextInt();
					} catch (Exception e) {
						System.out.println("Introduzca un numero del 1 al 10");
					}				
					if ((producto != -1) && (producto>0) && (producto<11)) {
					
						String nombre = arrayProductos[producto-1].getNombre();
						double precio = arrayProductos[producto-1].getPrecio();
					
						System.out.println(nombre + ", " + precio + " euros");
					
						System.out.println("Que cantidad desea?");
						try {
						cantidad = teclado.nextInt();
						}catch(Exception e) {
							System.out.println("Introduzca un numero valido");
						}
						System.out.println("Total: " + cantidad*arrayProductos[producto-1].getPrecio() + " euros");
					
						arrayProductos[producto-1].meterCantidad(cantidad);
						tienda.meterProducto(producto-1, cantidad, precio);
		
					}			
				}while(producto != -1);
			}
		
			// Informe general
			System.out.println();
			System.out.println("PRODUCTOS SUMINISTRADOS EN TOTAL:");
			System.out.println();
			double cantidadTotal = 0;
			for (Producto prod: arrayProductos) {
				System.out.println(prod.getNombre() + ": " + prod.getCantidadTotal());
				cantidadTotal= cantidadTotal + prod.getCantidadTotal()*prod.getPrecio();
			}
			System.out.println("Precio TOTAL = " + cantidadTotal);
			System.out.println();
		
			//Informes de las tiendas
			for (Tienda tienda : arrayTiendas) {
				tienda.mostrarInforme();	
			}
		
			
			System.out.println("Desea hacer otra vuelta (s/n)?");
			try {
			pregunta= teclado2.nextLine();
			}catch(Exception e){
				System.out.println("Introduzca un caracter valido");
			}
			
		}while(pregunta.equalsIgnoreCase("s"));	
		
		System.out.println();
		System.out.println("El programa ha finalizado");
		
		
		}


	}


