package es.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import es.entities.Book;

public class StreamToList {

	public static void main(String[] args) {
		
		Book l1 = new Book("El señor de los anillos", 1000);
		Book l2 = new Book("La fundacion", 500);
		Book l3 = new Book("El caliz de fuego", 600);
		
		Stream<Book> st = Stream.of(l1, l2, l3);
		
		// Convierte el stream en una lista
		List<Book> lista = st.collect(Collectors.toList());
		
		System.out.println(lista);

	}

}
