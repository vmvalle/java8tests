package es.streams;

import java.util.Arrays;
import java.util.List;

import es.entities.Person;

public class FindAnyOrElse {
	
	private static List<Person> persons = Arrays.asList(new Person("Victor", 10), new Person("Pablo", 11),
			new Person("Jose", 12), new Person("Pablo", 14));

	public static void main(String[] args) {

		withObjects();
		withStrings();

	}
	
	public static void withObjects() {
		
		Person persona = persons.stream() // Convert to steam
				.filter(x -> "Pablo".equals(x.getName()) && x.getAge() == 11) // we want "Pablo" only with 11 years old
				.findAny() // If 'findAny' then return found
				.orElse(null); // If not found, return null
		
		System.out.println(persona.toString());
	}
	
	public static void withStrings() {
		
		String name = persons.stream()
				.filter(x -> "Miguel".equals(x.getName()))
				.map(Person::getName) //convert stream to String
				.findAny()
				.orElse("No se ha encontrado ninguna persona llamada Miguel.");
		
		System.out.println(name);
	}

}
