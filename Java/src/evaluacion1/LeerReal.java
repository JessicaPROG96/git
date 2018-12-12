package evaluacion1;

import java.util.Scanner;

public class LeerReal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d;
		Scanner teclado;
		teclado=new Scanner(System.in);
		System.out.println("da valor a la variable d");
		d=teclado.nextDouble();
		System.out.println("El valor de la variable d es:" +d);
		teclado.close();
		
	}

}
