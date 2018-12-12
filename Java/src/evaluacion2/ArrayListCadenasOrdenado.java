package evaluacion2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArrayListCadenasOrdenado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Crea la clase ArrayListCadenas que recibe Strings por teclado hasta que se introduce un String en blanco
y los va almacenando en un ArrayList. Cuando finaliza la introducción muestra el contenido del array por
pantalla.
  */
		
// necesidades previas 
		String cadena; 
		ArrayList<String> arrayListString = new ArrayList<String>();
		
//informo que necesito un objeto 
		Scanner teclado; 
	 teclado=new Scanner(System.in);
		
//leo una cadena 
		System.out.println("introduce una cadena:");
		cadena = teclado.nextLine();
		
// introduzco la condición 
		while (!cadena.isEmpty ()) {
			// añado la cadena al arrayList 
			arrayListString.add(cadena); 
		

		//leo otra cadena 
			System.out.println("introduce una cadena:");
			cadena = teclado.nextLine();
		}
		// libero la memoria asignada al objeto llamado teclado 
			teclado.close();
			
			// ordeno el arrayList 
			Collections.sort(arrayListString);
			
			
		// muestro el contenido del arrayList 
			for (int posicion=0;posicion<arrayListString.size (); posicion++) {		
				System.out.println (arrayListString.get(posicion));
	}

	}
}


