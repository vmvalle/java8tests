package es.codinggame;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DescentGame {

	/**
	 * https://www.codingame.com/training/easy/the-descent/solution
	 * 
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/*
		 * Game information: Let's destroy those mountains to secure our landing...
		 * 
		 * Height of mountain 0 : 9
		 * Height of mountain 1 : 8
		 * Height of mountain 2 : 7
		 * Height of mountain 3 : 6
		 * Height of mountain 4 : 5
		 * Height of mountain 5 : 4
		 * Height of mountain 6 : 3
		 * Height of mountain 7 : 2
		 */
		Scanner in = new Scanner(System.in);

		while (true) {
			
			// Almacena los datos de tipo int del objeto Scanner en una lista
			List<Integer> heights = IntStream.range(0, 8)
					.map(i -> in.nextInt())
					.boxed()
					.collect(Collectors.toList());
			
			// Obtenemos el valor máximo
			int highest = heights.stream()
					.mapToInt(i -> i)
					.max()
					.getAsInt();

			System.out.println(heights.indexOf(highest));
		}

	}

}
