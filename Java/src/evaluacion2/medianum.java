package evaluacion2;

import java.util.Scanner;

public class medianum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Realiza el pseudocódigo para el programa MEDIANUM que pide números por pantalla y los almacena en
un array hasta que se introduzca un número negativo que no será tenido en cuenta o hasta que esté lleno
el array. Después calcula la Media y la muestra.
  */
	// necesidades previos 
		int n, posicion, elementos; 
		int [] arrayenteros = new int [5];
		double media; 
	 

		Scanner teclado=new Scanner(System.in);
		
		//lee un valor 
		System.out.println("introduce un valor");
		n=teclado.nextInt();
	elementos = 0; 
	
	while (elementos <5 && n >=0) {
		arrayenteros [elementos] = n; 
		elementos = elementos + 1; 
		// leo otro valor 
		
		if (elementos ==4); 
		System.out.println("introduce un valor");
		n=teclado.nextInt();	
	}
 // libero la memoria asignada al objeto llamado teclado 
	teclado.close(); 
	posicion = 0; 
	media = 0.0; 
	
	while (posicion < elementos) {
		media = media + arrayenteros [posicion]; 
		posicion = posicion + 1; 
	}
	media = media / elementos; 
	System.out.println ("la media es" + media); 
	}

}
