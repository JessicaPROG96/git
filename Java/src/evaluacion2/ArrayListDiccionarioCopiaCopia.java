package evaluacion2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Collections;
import java.util.InputMismatchException;

public class ArrayListDiccionarioCopiaCopia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Crea la clase ArrayListDiccionario que muestra un menú por pantalla con las siguientes opciones
Añadir Palabra. Pide una palabra y la añade al array, si todavía no existe, en la posición que le
corresponda alfabéticamente.
 
Buscar Palabra. Pide una palabra y la busca en el array. Si la encuentra la muestra y si no la encuentra
muestra un mensaje de error.

Borrar Palabra. Pide una palabra y la elimina, si es que existe, del array. Si no la encuentra muestra un
mensaje de error.

Listar Diccionario. Muestra todos los elementos del diccionario por pantalla, si es que tiene elementos,
ordenados alfabéticamente.

Salir. Realiza las operaciones necesarias para la correcta finalización del programa..
  */
		
// necesidades previas  
	  int opcion; //Guardaremos la opcion del usuario
		String palabra; 
		ArrayList<String> Diccionario = new ArrayList<String>();
		  
		// creo el objeto 
    Scanner sn = new Scanner(System.in);
 
       
      System.out.println("1. Añadir palabra");
      System.out.println("2. Buscar Palabra");
      System.out.println("3. Borrar Palabra ");
      System.out.println("4. Listar Diccionario");
      System.out.println("5. Salir");
       // pido la opción 
      System.out.println("Escribe una de las opciones");
      opcion = sn.nextInt();
   
      while  (opcion !=0) {
      	// pido otra opción 
      	System.out.println("Escribe una de las opciones");
        opcion = sn.nextInt();
         
    
      switch (opcion) {
          case 1:
         // añadir palabra
          // pido una palabra
          	sn.nextLine();
          	System.out.println("introduce una palabra");
        		palabra = sn.nextLine();
        		// si todavía no existe 
        		if (!Diccionario.contains(palabra)) {
        			//añado la palabra
        			Diccionario.add(palabra); 
            }
              break;
             
          case 2:
          	// Buscar palabra
          	/*Buscar Palabra. Pide una palabra y la busca en el array. 
          	 * Si la encuentra la muestra y si no la encuentra
          	 * muestra un mensaje de error.
          	 * */
          	// Pedir palabra 
          	sn.nextLine();
          	System.out.println("introduce una palabra");
        		palabra = sn.nextLine();
        	// busca en el arrays
              if (Diccionario.contains("palabra")) {
              	System.out.println("la palabra " + "está en el diciconarios"); 
              }
              else  {
              	// si no la enuentra 
              	System.out.println("error. La palabra" + palabra + "No está en el dicionariao");
              } 
              break;
          case 3:
          	// borrar palabra 
          	/*Borrar Palabra. Pide una palabra y la elimina, si es que existe, del array.
          	 *  Si no la encuentra muestra un mensaje de error.*/
          	//pido la palabra
          	sn.nextLine();
          	System.out.println("introduce una palabra");
        		palabra = sn.nextLine();
        		 if (Diccionario.contains("palabra")) {
        			 // si la encuentra la borra y 
        		 Diccionario.remove("");
        		 System.out.println("error. La palabra" + palabra + "ha sido borrada del dicionariao");
        		 
             	System.out.println(""); 
             }
        		 else {
        		 // si no la encuentro muestra un mensaje de error 
        			 System.out.println("error. La palabra" + palabra + "No está en el dicionariao");
        		 }
              break;
              
          case 4:
         // Listar diciconario
          	 System.out.println("Has seleccionado la opcion 4");
          	// Muestro todoslos elementos del diccionario por pantalla,
          	//si es que tiene el elemento,
          	// ordenados alfabeticamente
          	 Collections.sort(Diccionario); 
          	for (int posicion=0;posicion<Diccionario.size(); posicion++) {
          		System.out.println (Diccionario.get(posicion)); 
          	}
          	break;
           
            // salir 
          case 5:
              System.out.println("Ha seleccionado salir");
      }

	}
}
}



