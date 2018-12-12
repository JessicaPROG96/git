package evaluacion2;

import java.util.Scanner;
import java.util.ArrayList;

public class NumvecesCopiaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Crea la clase ArrayListNumveces que pide números del 1 al 5 por pantalla y calcula el número de veces
que han sido introducidos utilizando un ArrayList. Finaliza la introducción de datos cuando se
introduzca un número incorrecto. Al finalizar muestra por pantalla el número de veces que se ha
introducido cada número.
		  */
		
		
// necesidades previas 
				int n, posicion; 	
// Creo el ArrayList
				ArrayList<Integer> arrayListInteger = new ArrayList<Integer>();
// Lo inicializo con 5 elementos 
				for (posicion=0;posicion<5;posicion++) {
					arrayListInteger.add(0);
				}
						
//informo que necesito un objeto 
			Scanner teclado; 
			teclado = new Scanner(System.in);
				
//lee un valor 
				System.out.println("introduce un valor");
				n=teclado.nextInt();
				
// calcula elnúmero de veces que ha sido introduciodos 
				
			while (n >=0 && n <=5) {
// cojo el valor que hay en esa posicion en ArrayList 
		
					posicion = arrayListInteger.get(n, "NuevoValor");
// le suma 1
					posicion = posicion + 1; 
					
// actualizo el valor que hay en esa posicion en arrayList 
					arrayListInteger.set(n, posicion); 
			
		
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
					
// Al finalizar la introduccion de datos muestra por pantalla el número de veces que se ha introducido 
			posicion = 0; 
			while (posicion < 5) { 
			System.out.println (posicion + ":" +arrayenteros [posicion] +  "veces" ); 
			posicion = posicion + 1 ; 
			}
	} 
	
}