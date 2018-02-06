package es.lambda;

/**
 * Veremos como sustituir el tener que crear una clase anónima que implemente la interfaz Runnable
 * 
 * @author vmvalle
 *
 */
public class PruebaThreads {

	public static void main(String[] args) {

		Thread hilo = new Thread(
				() -> System.out.println("Hola desde el hilo...") // Esta línea sustituye al método run de la interfaz Runnable
		);
		hilo.start();
	}

}
