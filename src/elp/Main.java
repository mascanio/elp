package elp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, r;
		
		System.out.println("Introduzca el dividendo: ");
		a = sc.nextInt();
		System.out.println("Introduzca el divisor: ");
		b = sc.nextInt();
		
		c = a / b;
		r = a % b;
		System.out.println("Resultado = " + c + " resto: " + r);
		
		sc.close();
	}

}
