package es.lambda;

import java.util.function.BiConsumer;

import es.entities.Product;

/**
 * BiConsumer es una interfaz para representar una acción con dos argumentos de
 * entrada de distinto tipo. Se usa para representar acciones que modifiquen un
 * objeto recibiendo un objeto de otro tipo.
 * 
 * Tiene como interfaces especializadas: ObjDoubleConsumer, ObjIntConsumer y
 * ObjLongConsumer que reciben un objeto de tipo T y otro del tipo especificado
 * en el nombre.
 * 
 * Todas implementan un método funcional denominado accept.
 * 
 * @author vmvalle
 *
 */
public class PruebaBiConsumer {

	// Consumer que devuelve el número de páginas de un libro
	private static BiConsumer<Product, Double> applyDiscount = (x, y) -> {
		System.out.println("Precio sin rebajar " + x.getPrice());
		x.setPrice(x.getPrice() * y);
	};

	public static void main(String[] args) {

		Product product = new Product("TV", 1000);

		// Ejecuta primero el método "accept" y después "andThen"
		applyDiscount.andThen((x, y) -> System.out.println("Precio rebajado " + x.getPrice())).accept(product, 0.9);

	}

	class Discount {

		double price;

		public Discount(double price) {
			super();
			this.price = price;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

	}

}
