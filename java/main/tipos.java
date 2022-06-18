// Ejercicio 05 - JAVA SE

package main;

public class tipos {

	public static void main(String[] args) {
		
		// Declaramos carácter
        char a = 'G';
         
       // Declaramos enteros
       int i=89;
        
       // Usamos byte y short si la memoria es una prioridad
       byte b = 4;
        
       // Esto dará error ya que el número es
       // mayor que el rango de bytes
       // byte b1 = 7888888955;
        
       short s = 56;
        
       // Esto dará error ya que el número es 
       // más grande que el rango de short
       // short s1 = 87878787878;
        
        
       // Por defecto, en Java, el valor de la fracción es double
       double d = 4.355453532;
        
       // Para float usaremos 'f' como sufijo
       float f = 4.7333434f;
       
       System.out.println("char: " + a); 
       System.out.println("integer: " + i); 
       System.out.println("byte: " + b); 
       System.out.println("short: " + s); 
       System.out.println("float: " + f); 
       System.out.println("double: " + d); 
   }    
}
