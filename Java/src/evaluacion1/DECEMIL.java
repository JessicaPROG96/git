package evaluacion1;

import java.util.Scanner;

public class DECEMIL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n, unidad, decena, centena, millar, dmillar, resto;
Scanner teclado=new Scanner(System.in);
n=teclado.nextInt();
unidad=n % 10;
resto=n/10;
decena=resto %10;
resto=resto/10;
centena=resto%10;
resto=resto/10;
millar=resto%10;
dmillar=resto/10;
System.out.println(n+ unidad+ decena+ centena+ millar+ dmillar);
	}

}
