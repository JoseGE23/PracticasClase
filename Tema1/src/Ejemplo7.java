
public class Ejemplo7 {

	public static void main(String[] args) {

		// Diferencia entre print y println.
		System.out.println("Hola, me llamo Carlos");
		System.out.println("Esto es la clase de Programación");

		System.out.println();

		System.out.print("Hola, me llamo Carlos");
		System.out.println("Esto es la clase de Programación");

		// Concatenación de cadenas (Strings).
		int edad = 30;
		System.out.println("Tienes " + edad + " años.");

		float precio = 90.50f;
		System.out.println("El precio son " + precio + " euros.");

		// Caracteres de control.
		// \n Salto de línea.
		System.out.println("Hay siete tipos \nprimitivos en Java.");

		// \t Tabulado
		System.out.println("\nLISTADO DE PRODUCTOS");
		System.out.println("Artículo \tPrecio");
		System.out.println("Estuche \t15€");
		System.out.println("Lápiz \t\t0.90€");

	}

}
