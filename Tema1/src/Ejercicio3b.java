import java.util.Scanner;

public class Ejercicio3b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Pon dos numeros los dividiré y te devolveré " + "el cociente y el resto");

		System.out.println("Pon el primer numero");

		int num1 = entrada.nextInt();

		System.out.println("Pon el segundo número");

		int num2 = entrada.nextInt();

		int cociente = num1 / num2;

		System.out.println(cociente);

		System.out.println("Este es el cociente");

		int resto = num1 % num2;

		System.out.println(resto);

		System.out.println("Este es el resto");

	}

}