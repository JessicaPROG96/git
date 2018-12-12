package evaluacion1;

import java.util.Scanner;

public class Cubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int n;
		System.out.println("Añade el valor de la variable n");
		n=teclado.nextInt();
		System.out.println("El valor de la variable n es:" +n*n*n);
	teclado.close();
	}

}
