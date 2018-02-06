package es.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndCollect {

	/**
	 * Imprime los números pares de una lista
	 */
	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> resultados = new ArrayList<Integer>();

		resultados = numeros.stream() // Convierte la lista en un flujo
				.filter(n -> n % 2 == 0) // No es necesario indicar el tipo de variable que es n
				.collect(Collectors.toList()); // Recopila en una lista los datos que han pasado por el filtro

		System.out.println("Números pares: " + resultados);

	}

}
