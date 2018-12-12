package evaluacion1;

import java.util.Scanner;

public class Loncircu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double r;
double resultado;
Scanner teclado=new Scanner(System.in);
System.out.println("calcula el valor de la circuferemcia");
r=teclado.nextDouble();
resultado=2*(Math.PI)*r;
System.out.printf("La longitud de la circuferencia es:%.2f",resultado);
	teclado.close();
	}

}
