// Java SE - Ejercicio 16
package principal;

//import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class condicionales {
    public static void main(String args[]) {
	
    	int numeroAleatorio = (int) Math.random();

            System.out.println(numeroAleatorio);
            
         if (numeroAleatorio == 0) {
        	 System.out.print(true);
         	 System.out.print(" -> rojo");
         }
         if (numeroAleatorio != 0) {
        	 System.out.print(false);
         	 System.out.print(" -> negro");
         }
         
      // Mostramos temperatura y categoría
         Scanner lectura = new Scanner (System.in);
         System.out.println("\n\n¿Qué temperatura hay?: ");
         String nombre = lectura.next();
         
         // Si la temperatura es menor de 5ºC
         float temperatura = 0;
         
         if (temperatura < 5) {
             System.out.println("Clima frío - Polar");
         }        
         else if (temperatura >= 5 || temperatura <10) { 
             System.out.println("Clima frío - Alta montaña");
         }
         else if (temperatura >= 10 || temperatura <13.5) {
            System.out.println("Clima templado - Oceánico");
         }
         else if (temperatura >= 13.5 || temperatura <16.5) {
             System.out.println("Clima templado - Oceánico");
         }
         else if (temperatura >= 16.5 || temperatura <20) {
             System.out.println("Clima templado - Oceánico");
         }
         else if (temperatura >= 20 || temperatura <23.5) {
             System.out.println("Clima templado - Ecuatorial");
         }
         else if (temperatura >= 23.5 || temperatura <26.5) {
             System.out.println("Clima templado - Tropical");
         }
         else if (temperatura >= 26.5) {
             System.out.println("Clima templado - Desértico");
         }      
         
    }
}