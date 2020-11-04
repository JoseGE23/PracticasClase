
public class Ejemplo5 {

	public static void main(String[] args) {

		// Conversiones explícitas

		// El valor 50, aunque esté guardado en una variable int,
		// también cabe en una variable byte.
		int num1 = 50;

		byte num2 = (byte) num1;

		System.out.println(num2);

		// El valor 3.000.000.000, que cabe en un double, no va a caber
		// en un int, luego se producirá un desbordamiento.
		double num3 = 3000000000.0;

		int num4 = (int) num3;

		System.out.println(num4);

	}

}
