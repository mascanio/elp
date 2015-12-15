package elp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		System.out.println("Introduzca el dividendo: ");
		a = sc.nextInt();
		System.out.println("Introduzca el divisor: ");
		b = sc.nextInt();

		if (b != 0) {
			c = a / b;
			System.out.println("Resultado = " + c);
		} else {
			System.out.println("Error, división por 0");	
		}
		sc.close();
	}

}
