package evaluacion2;

import java.util.Scanner;

public class Numveces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pide n�meros de 0 a 9 por pantalla y calcula el n�mero de
		 *  veces que han sido introducidos utilizando un array. Finaliza la introducci�n de datos cuando se introduce un valor 
		 *  negativo o mayor que 9. Al finalizar la introducci�n de datos muestra por pantalla el n�mero de veces que se ha introducido cada n�mero.
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
				
	// calcula eln�mero de veces que ha sido introduciodos 
				
			while (n >=0 && n <=9) {
				arrayenteros [n] = arrayenteros [n] + 1; 
				
				// leo otro valor
				System.out.println("introduce un valor");
				n=teclado.nextInt();	
			}
			
			
			// libero la memoria asignada al objeto llamado teclado 
			teclado.close();	 
			
	 // Al finalizar la introduccion de datos muestra por pantalla el n�mero de veces que se ha introducido 
			posicion = 0; 
			while (posicion < 10) { 
			System.out.println (posicion + ":" +arrayenteros [posicion] +  "veces" ); 
			posicion = posicion + 1 ; 
			}
	} 
	
}