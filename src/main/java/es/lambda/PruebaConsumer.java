package es.lambda;

import java.util.function.Consumer;

import es.entities.Product;

/**
 * La interfaz Consumer es una variante de Function en la que no se devuelve
 * valor, es decir modifica el objeto que invoca mediante un método que se
 * denomina accept que recibe un objeto de tipo T y devuelve void.
 * 
 * Se usan para definir una acción sobre un objeto. Por ejemplo, incrementa el
 * precio de un Vuelo en un determinado porcentaje, resta a una Fecha un número
 * de días o imprime en la consola un valor.
 * 
 * Java 8 proporciona también las interfaces especializadas DoubleConsumer,
 * LongConsumer o IntConsumer también implementando el método accept.
 * 
 * @author vmvalle
 *
 */
public class PruebaConsumer {

	// Consumer que devuelve el número de páginas de un libro
	private static Consumer<Product> applyIVA = x -> x.setPrice(x.getPrice() * 1.21);

	public static void main(String[] args) {

		Product product = new Product("TV", 1000);

		// Ejecuta el consumer con el parámetro book
		applyIVA.accept(product);

		System.out.println("El precio con IVA incluido es " + product.getPrice());

	}

}
