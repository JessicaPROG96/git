package evaluacion1;

import java.util.Scanner;

public class RETESUE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double sueldo, retencion;
Scanner teclado=new Scanner(System.in);
System.out.println("escribe el sueldo");

sueldo=teclado.nextDouble();

if(sueldo<1000) {
	retencion=sueldo*0.10;
}
else if(sueldo==1000) {
	retencion=sueldo*0.12;
}
else if(sueldo>1000 && sueldo<2000) {
	retencion=sueldo*0.14;
}
else if(sueldo==2000) {
	retencion=sueldo*0.16;
}
else {
	retencion=sueldo*0.18;
}
System.out.println("La retencion del sueldo es:" +retencion);
teclado.close();
	}

}
