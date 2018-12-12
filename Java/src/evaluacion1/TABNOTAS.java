package evaluacion1;

import java.util.Scanner;

public class TABNOTAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota;
		Scanner teclado = new Scanner(System.in);
//leer nota
		System.out.println("Nota: ");
		nota = teclado.nextInt();
		teclado.close();// libero la memoria asignada al objeto llamado teclado

		if (nota >= 0) {
			if (nota < 3) {
				System.out.println("MD");
			} else if (nota < 5) {
				System.out.println("INS");
			} else if (nota < 6) {
				System.out.println("Suf");
			} else if (nota < 7) {
				System.out.println("Bien");
			} else if (nota < 9) {
				System.out.println("NOT");
			} else if (nota <= 10) {
				System.out.println("Sobre");
			}
		}
	}

}
