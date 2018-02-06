package es.streams;

import java.util.ArrayList;

import es.entities.Product;

public class MapFilterAndSum {

	/**
	 * 1. Sumamos el IVA a nuestros productos
	 * 2. Elimnamos de la lista los que superen el valor de 100€
	 * 3. Calculamos el gasto total
	 */
	public static void main(String[] args) {

		ArrayList<Product> products = new ArrayList<Product>();

		products.add(new Product("A", 80));
		products.add(new Product("B", 50));
		products.add(new Product("C", 70));
		products.add(new Product("D", 95));

		double result = products.stream()
				.mapToDouble(product -> product.getPrice() * 1.21) // Aplica la función lambda a todos los elementos del stream en un stream de Double
				.filter(price -> price < 100) // Filtra los elementos
				.sum(); // Suma todos 

		System.out.println("Gasto total: " + result);
	}

}
