package evaluacion1;

import java.util.Scanner;

public class MAYORMENOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
int b;
Scanner teclado=new Scanner(System.in);
System.out.println("Escribe a y b");
a=teclado.nextInt();
b=teclado.nextInt();
if(a>b) {
	System.out.println("a es mayor que b");
}
else if(a==b) {
	System.out.println("a es igual que b");
}
else {
	System.out.println("a es menor que b");
}
teclado.close();
	}

}
