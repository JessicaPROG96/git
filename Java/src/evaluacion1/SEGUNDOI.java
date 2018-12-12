package evaluacion1;

import java.util.Scanner;

public class SEGUNDOI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora, min, seg;
		Scanner teclado=new Scanner(System.in);
		hora=teclado.nextInt();
		min=teclado.nextInt();
		seg=teclado.nextInt();
		seg=seg+1;
		if(seg>59) {
			min=min+1;
			seg=0;
			if(min>59) {
				min=0;
				hora=hora+1;

		}
		}
		
		System.out.println(hora+"h" +min+"m" +seg+"s");
		teclado.close();
	}

}
