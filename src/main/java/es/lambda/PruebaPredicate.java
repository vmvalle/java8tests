package es.lambda;

import java.util.function.Predicate;

import es.entities.Book;

/**
 * Predicate implementa una condición lógica para métodos que necesiten un filtro o condición.
 * Predicate implementa un método denominado test que devuelve un boolean a partir de un objeto de tipo T.
 * @author vmvalle
 *
 */
public class PruebaPredicate {
	
	private static Predicate<Book> paginasSuficientes = x -> x.getPages() > 80;

	public static void main(String[] args) {
		
		Book book = new Book("Libro1", 100);
		
		boolean b = paginasSuficientes.test(book);
		
		System.out.println(b);

	}

}
