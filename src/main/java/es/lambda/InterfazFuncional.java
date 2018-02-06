package es.lambda;

/**
 * En este caso se utiliza la expresión lambda para sustituir una clase anónima
 * 
 * @param args
 */
public class InterfazFuncional {
	
	// Todas las interfaces que tengan un solo método son compatibles con lambdas
	@FunctionalInterface
	interface Suma {
		public Integer sumar(Integer a, Integer b);		
	}

	public static void main(String[] args) {		
		 Suma suma = (a,b) -> a + b;
		 System.out.println(suma.sumar(2, 3));		 
	}
	
}
