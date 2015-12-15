package elp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Inrtoduzca el dividendo: ");
		a = sc.nextInt();
		System.out.println("Inrtoduzca el d: ");
		b = sc.nextInt();
		
		c = a / b;
		System.out.println("Resultado = " + c);
		
		sc.close();
	}

}
