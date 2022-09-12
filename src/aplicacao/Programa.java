package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	
	public static double PI = 3.14159;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com um numero");
		double numero = sc.nextDouble();
		
		double c = circunferencia(numero);
		double v = volume(numero);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", PI);
		
		sc.close();
		

	}
	
	public static double circunferencia(double numero) {
		return 2.0 * PI *numero;
	}

	public static double volume(double numero) {
		return 4.0 * PI *numero*numero*numero*numero/3.0;
	}

}
