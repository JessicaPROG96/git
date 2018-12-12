package evaluacion1;

import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
Scanner teclado=new Scanner(System.in);
n=teclado.nextInt();
if (n<0) {
	System.out.println("n es menor que 0");
}
else if(n>0) {
	System.out.println("n es mayor que 0");
}
else {
	System.out.println("n es igual que 0");
}
teclado.close();
	}

}
