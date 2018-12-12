package evaluacion1;

import java.util.Scanner;

public class Areacirc {

	public static void main(String[] args) {
		
		double r;
		double resultado;
		Scanner teclado=new Scanner(System.in);
		System.out.println("calcula el valor del area");
		r=teclado.nextDouble();
		resultado=Math.PI*r*r;
		System.out.printf("el area del circulo es %.2f",resultado);
		teclado.close();
	}

}
