package evaluacion1;

import java.util.Scanner;

public class LeerCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String d;
String h;
Scanner teclado/*informo que necesito un objeto de tipo Scanner llamado teclado*/=new Scanner(System.in);//creo la clase Scanner llamado teclado
System.out.println("Añade valor a la cadena");
d=teclado.nextLine();//lee la frase entero
h=teclado.next();//lee la primera palabra
System.out.println("EL valor de la variable d es:" +d+"separación" +h);
teclado.close();
	}

}
