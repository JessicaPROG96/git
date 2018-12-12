package evaluacion1;

import java.util.Scanner;

public class NXN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int cuadrado;
int n;
int diferencia;
Scanner teclado=new Scanner(System.in);
n=teclado.nextInt();
cuadrado=n*n;
if(cuadrado<=100) {
	diferencia=100-cuadrado;
}
else{
	diferencia=cuadrado-100;
}
System.out.println("la diferencia es " +diferencia);

	}

}
