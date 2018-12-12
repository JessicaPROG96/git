package evaluacion1;

import java.util.Scanner;

public class Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double interes, cantidad, tipodeinteres;
		int tiempo;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce los datos, el tipo de interes sera del 5,5%" );
		cantidad=teclado.nextDouble();
		tipodeinteres=5.5;
		tiempo=teclado.nextInt();
		interes=(cantidad*tipodeinteres*tiempo)/(360*100);
		System.out.println("el tipo de interes a pagar es: " +interes);
	}

}
