package es.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import es.entities.Book;

public class MapAndCollect {

	private static List<Book> books = Arrays.asList(
			new Book("El señor de los anillos", 1000),
			new Book("La fundacion", 500),
			new Book("El caliz de fuego", 600));

	public static void main(String[] args) {
		System.out.println("Títulos: " + getTitles(books));
		System.out.println("Total de páginas: " + getNumPages(books));
	}

	public static String getTitles(List<Book> books) {
		return books.stream()
				.map((l) -> l.getTitle()) // Obtiene los títulos de cada libro
				.collect(Collectors.joining(", ")); // Concatena las cadenas de texto
	}

	public static Integer getNumPages(List<Book> books) {
		return books.stream()
				.map((l) -> l.getPages())  // Obtiene las páginas de cada libro
				.collect(Collectors.reducing(Integer::sum)) // Suma todos los elementos
				.get(); // Obtiene el dato del objeto Optional<Integer>
	}

}
