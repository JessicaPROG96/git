package evaluacion1;

import java.util.Scanner;

public class LeerCaracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);//informo que necesito un objeto de clase Scanner llamado teclado, creo la clase Scanner llamado teclado
char l;//creo la variable de tipo chart
l=teclado.nextLine().charAt(0);//añado valor a la variable
System.out.println("EL valor de la variable l es:" +l);
	}

}
