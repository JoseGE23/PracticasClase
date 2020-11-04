public class Ejemplo1 {

	public static void main(String[] args) {

		// Ejemplo de desbordamiento de una variable.
		byte numero = 127;
		System.out.println(numero);
		numero = (byte) (numero + 1);
		System.out.println(numero);

		// Ejemplos de operaciones aritméticas.
		int resultado = 120 * 10 + 1;
		System.out.println(resultado);

		resultado = 10 % 3;
		System.out.println(resultado);

		// Ejemplos de operaciones relacionales.
		boolean resultado2 = 20 == 10;
		System.out.println(resultado2);

		resultado2 = 20 != 10;
		System.out.println(resultado2);

		resultado2 = 20 > 20;
		System.out.println(resultado2);

		// Ejemplos de operaciones con decimales.
		double resultado3 = 120.5 * 10;
		System.out.println(resultado3);

		// Ejemplos de operaciones lógicas.
		resultado2 = true && true;
		System.out.println(resultado2);

		boolean condicion1 = true;
		boolean condicion2 = false;
		resultado2 = condicion1 && condicion2;
		System.out.println(resultado2);

		resultado2 = true || true;
		System.out.println(resultado2);

		boolean condicion = false;
		System.out.println(!condicion);

	}

}
