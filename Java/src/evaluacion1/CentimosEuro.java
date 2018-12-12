package evaluacion1;

import java.util.Scanner;

public class CentimosEuro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		double cantidad;
		int Euro;
		int centimo;
		System.out.println("Introduce un valor:");
		cantidad=teclado.nextDouble();
		teclado.close();//cerramos teclado
		Euro=(int)cantidad;//convertimos cantidad de real a entero
		centimo=(int)((cantidad-Euro)*100);
		System.out.println("Cantidad es"+cantidad+"que en euros seria: " +Euro+"y en centimos seria:" +centimo);
	}

}
