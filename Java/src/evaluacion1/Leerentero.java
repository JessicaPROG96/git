package evaluacion1;

import java.util.Scanner;

public class Leerentero {

	public static void main(String[] args) {
		//lee un numero entero por teclado
		//muestra por pantalla
		int n;
		Scanner teclado=new Scanner (System.in);//informo que necesito de la clase Scanner
		System.out.println("Introduce el valor:");
		n=teclado.nextInt();//asigno el valor de n
		System.out.println("El valor de la variable es:" +n);
		teclado.close();
	}

}
