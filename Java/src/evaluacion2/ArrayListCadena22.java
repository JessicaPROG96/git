package evaluacion2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCadena22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Realiza la clase Java Diccionario que recibe palabras por teclado y las almacena en un array de Strings en
orden alfabético ascendente hasta que llega una cadena vacía que no será tenida en cuenta (isEmpty()) o
el array esté lleno. Una vez finalizado el proceso muestra el contenido del array por pantalla.
  */
		
// necesidades previas 
		String cadena; 
		ArrayList<String> arrayListString = new ArrayList<String>();
		
//Creo el objeto Scaner Teclado  
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
			System.out.println("introduce una cadena");
			cadena = teclado.nextLine();
			
		// libero la memoria asignada al objeto llamado teclado 
			teclado.close();
			
			
		// muestro el contenido del arrayList 
			for (String valor : arrayListString) {
				System.out.println(valor);			
	}

}
}
}

