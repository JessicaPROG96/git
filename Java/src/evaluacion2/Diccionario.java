package evaluacion2;

import java.util.Scanner;

public class Diccionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Realiza la clase Java Diccionario que recibe palabras por teclado y las almacena en un array de Strings en
orden alfabético ascendente hasta que llega una cadena vacía que no será tenida en cuenta (isEmpty()) o
el array esté lleno. Una vez finalizado el proceso muestra el contenido del array por pantalla.
  */
		
// necesidades previas 
		String cadena; 
		int elementos = 0, posicion; 
		String diccionario [] = new String [10]; 
		
//informo que necesito un objeto 
		Scanner teclado; 
	 teclado=new Scanner(System.in);
		
//lee un valor 
		System.out.println("introduce una cadena");
		cadena = teclado.nextLine();
		
// Inizializar la variable		
   elementos = 0; // inicializar la variable 
// introduzco la condición 
		while (!cadena.isEmpty () && elementos < 10) {
// añado la cadena al diccionario de manera ordenada
		}	
			
// buscar la posicion 	
		posicion =0; 


while (posicion<elementos) {
// compruebo si es la posicion 
	if (cadena.compareTo(diccionario[posicion]) <0) {
		// si es la posicion 
			break; 	
	}
	
	
// voy a la siguiente posicon 
	posicion = posicion + 1; 
}

// desplazamos los elementos desde la posicion una a la derecha 
for (int posmov=elementos;posmov>posicion;posmov--) {
	diccionario[posmov]=diccionario[posmov-1]; 
}

// inserto la cadena en la posicion 
diccionario[posicion] = cadena; 

// incremento el nuemro de elementos 
	elementos = elementos + 1; 


// leo otra cadena  
			System.out.println("introduce una cadena");
			cadena = teclado.nextLine();
			
		
// libero la memoria asignada al objeto llamado teclado 
		teclado.close();
		
// libero o muestro el contido del diccionario 
		for(posicion=0;posicion<elementos;posicion++) {
			System.out.println(diccionario[posicion]);
			System.out.println (posicion + "cadena" + diccionario [posicion] +  "veces" );
		}
	}


}


