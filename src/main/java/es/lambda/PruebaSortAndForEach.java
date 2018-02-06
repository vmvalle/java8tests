package es.lambda;

import java.util.ArrayList;
import java.util.Collections;

import es.entities.Person;

/**
 * Ordena los nombres de la lista en orden alfabético
 * 
 * @author vmvalle
 *
 */
public class PruebaSortAndForEach {

	public static void main(String[] args) {

		ArrayList<Person> miLista = new ArrayList<Person>();
		miLista.add(new Person("Miguel", 10));
		miLista.add(new Person("Alicia", 12));
		miLista.add(new Person("Pedro", 14));
		miLista.add(new Person("Raquel", 12));
		miLista.add(new Person("Esther", 9));
		miLista.add(new Person("Javier", 15));

		// Ordena la lista miLista
		Collections.sort(miLista, (Person p1, Person p2) -> p1.getName().compareTo(p2.getName()));

		// Para cada elemento de la lista realiza la función lambda que imprime el nombre
		miLista.forEach((final Person persona) -> System.out.println(persona.getName()));

	}

}
