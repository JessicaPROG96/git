package evaluacion1;

import java.util.Scanner;

public class VALORABS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner teclado=new Scanner(System.in);
		n=teclado.nextInt();
		if(n>0) {
			//si es positivo
			System.out.println("el valor absoluto de n es:" +n);

		}
		else {
			//si es negativo
			n=-n;
			System.out.println("el valor absoluto de n es:" +n);
		}
	
	} 

}
