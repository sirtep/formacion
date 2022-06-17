package main;

public class banderas {
	  static void azul() {
		 //Fondo azul
		  for (int i = 0; i < 3; i++) {
			  System.out.println("\033[44;37m                   \033[0m");
			}
	  }

	  static void amarillo() {
		 //Fondo amarillo
		  for (int i = 0; i < 3; i++) {
			  System.out.println("\033[43;30m                   \033[0m");
			}
	  }
	  public static void main(String[] args) {
		  azul();
		  amarillo();
	  }
	}
