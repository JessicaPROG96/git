package evaluacion2;

import java.util.Scanner;

public class Numveces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pide números de 0 a 9 por pantalla y calcula el número de
		 *  veces que han sido introducidos utilizando un array. Finaliza la introducción de datos cuando se introduce un valor 
		 *  negativo o mayor que 9. Al finalizar la introducción de datos muestra por pantalla el número de veces que se ha introducido cada número.
		  */
		
		
	// necesidades previos 
				int n, posicion; 
				int [] arrayenteros = new int [10];
				
//informo que necesito un objeto 
				Scanner teclado; 
			 teclado=new Scanner(System.in);
				
				//lee un valor 
				System.out.println("introduce un valor");
				n=teclado.nextInt();
				
	// calcula elnúmero de veces que ha sido introduciodos 
				
			while (n >=0 && n <=9) {
				arrayenteros [n] = arrayenteros [n] + 1; 
				
				// leo otro valor
				System.out.println("introduce un valor");
				n=teclado.nextInt();	
			}
			
			
			// libero la memoria asignada al objeto llamado teclado 
			teclado.close();	 
			
	 // Al finalizar la introduccion de datos muestra por pantalla el número de veces que se ha introducido 
			posicion = 0; 
			while (posicion < 10) { 
			System.out.println (posicion + ":" +arrayenteros [posicion] +  "veces" ); 
			posicion = posicion + 1 ; 
			}
	} 
	
}