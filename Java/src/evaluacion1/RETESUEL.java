package evaluacion1;

import java.util.Scanner;

public class RETESUEL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double sueldo;
double retencion;
Scanner teclado=new Scanner(System.in);
sueldo=teclado.nextDouble();
if(sueldo<1000) {
	retencion=sueldo*0.10;
}
else if(sueldo==1000) {
	retencion=sueldo*0.12;
}
else {
	retencion=sueldo*0.14;
}
System.out.println("la retencion es:" +retencion);
	}

}
