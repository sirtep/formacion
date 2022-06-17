package main;

import java.util.Scanner;

public class loginpass {

	public static void main(String[] args) {
	
		Scanner teclado= new Scanner(System.in);
		int login=0;
		int pass=0;
		int intentos=1;
		int maximo=3;
			
				while((login!=1809)||(pass!=1234)&& (intentos<maximo)){
					
					System.out.print("Introduce login: ");
					login=teclado.nextInt();
					System.out.print("Introduce password:");
					pass=teclado.nextInt();
					
					if(intentos==3){
						System.out.println("Acceso denegado..");
						intentos=intentos-maximo;
					}
				
					intentos++;
			}
						
			System.out.println("Login y pass, correctos...");
						
	}

}