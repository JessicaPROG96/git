package evaluacion2;

import java.util.ArrayList;
import java.util.Scanner;

public class Numveces2ArrayList {

	public static void main(String[] args) {
		
		/*Pide números de 0 a 9 por pantalla y calcula el número de
		 *  veces que han sido introducidos utilizando un array. Finaliza la introducción de datos cuando se introduce un valor 
		 *  negativo o mayor que 9. Al finalizar la introducción de datos muestra por pantalla el número de veces que se ha introducido cada número.
		  */
	
	// necesidades previas 
				int n, posicion;
				Integer valor; 
				
	// Creo el ArrayList
				ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
				// Y lo inicializo con 10 elementos 
				for ( posicion=0;posicion<10;posicion++){
					arrayList.add(0); 
					
				}
//informo que necesito un objeto 
				Scanner teclado; 
			 teclado=new Scanner(System.in);
				
				//lee un valor 
				System.out.println("introduce un valor");
				n=teclado.nextInt();
				
	// calcula elnúmero de veces que ha sido introduciodos 
				
			while (n >=0 && n <=9) {
				// cojo el valor que hay en esa posicion en ArrayList 
				valor = ArrayList.get(n);
				// le suma 1
				valor = valor + 1; 
				
			// actualizo el valor que hay en esa posicion en arrayList 
				arrayList.set(n, valor); 
				
				
				// leo otro valor
				System.out.println("introduce un valor");
				n=teclado.nextInt();	
			}
			
			
			// libero la memoria asignada al objeto llamado teclado 
			teclado.close();	 
			
			
	 // muestro el contenido del arrayList 
			for (posicion=0;posicion <arrayList.size();posicon++) {
				valor = arrayList.get;
			}
					Integer valor: arrayList ) {
				System.out.println(valor2); 
			}
			
			
			
	} 
	
}