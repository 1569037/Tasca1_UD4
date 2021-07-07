/***
 * @author evelyn
 * Primera versión de Ejercicio5App
 * Fecha de 07/07/2021
 */
public class Ejercicio5App {
	public static void main(String[] args) {
		
		//Declaracion y asignacion de valor a las variables
		
		int a = 40;
		int b = 1;
		int c = 34;
		int d = 0;
		
		//Cambio de asignacion de valores
		
		int auxB;  //utilizamos variables auxiliares para no perder datos
		auxB = b;
		b = c;
		c = a;
		a = d;
		d = auxB;
		
		//Muestra por pantalla de los valores de la s variables
		
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		System.out.println("C = "+c);
		System.out.println("D = "+d);
		

	}

}
