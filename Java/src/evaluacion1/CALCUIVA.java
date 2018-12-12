package evaluacion1;

import java.util.Scanner;

public class CALCUIVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double cantidad, resultado;
Scanner teclado=new Scanner(System.in);
cantidad=teclado.nextDouble();
if(cantidad<=20000) {
	resultado=cantidad*0.10;
}
else{
	resultado=cantidad*0.21;
}
System.out.println("la cantidad de iva a pagar es:" +resultado);
	}

}
