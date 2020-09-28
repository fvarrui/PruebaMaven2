package dad.maven.prueba;

import org.apache.commons.lang.StringUtils;

/**
 * Combina objetos como un único String
 * @author fvarrui
 *
 */
public class Combinar {
	
	public static String combinar(Object [] array) {
		return StringUtils.join(array, " ");
	}

	public static void main(String[] args) {
		Object [] array = { "hola", 3.1416, "adios", 15, true };
		String resultado = combinar(array); // "hola 3.1416 adios 15 true"
		System.out.println(resultado);
	}

}
