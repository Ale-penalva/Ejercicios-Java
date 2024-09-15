import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {


*/Desenvolupar un programa en Java que:
Permeta als usuaris calcular l'àrea i el perímetre de tres formes geomètriques: cercle, rectangle i triangle.
Proporcione resultats precisos amb dos decimals
Funcione de la mateixa manera per a tots els ciutadans de TechVille. Per això, el format d'eixida ha de ser consistent en tots els casos.*/
		
		double radio;
		
		double perimetroCirculo;
		
		double perimetroRectangulo;
		
		double areaRectangulo;
		
		int base;
		
		int altura;
		
		double cateto1;
		
		double cateto2;
		
		
		System.out.println("Vamos a calcular el área de un círculo, para ello necesito que ingreses el radio de este: ");
		
		Scanner entrada=new Scanner(System.in);
		
		radio=entrada.nextInt();
		
		double area=Math.PI*radio*radio;
		
		System.out.printf("El área de tu círculo es: %.2f cm. ", area );
		
		perimetroCirculo= (2*Math.PI)*radio;
		
		System.out.printf("y su perímetro es de: %.2f cm. " , perimetroCirculo);
		
		System.out.println( '\n' 
		+ "Ahora, haremos lo mismo, pero con un rectángulo" + '\n' 
		+ "Dime el valor de la base del rectángulo:  ");
		
		base=entrada.nextInt();
		
		System.out.println("Dime ahora, la altura de tu triángulo: ");
		
		altura=entrada.nextInt();
		
		perimetroRectangulo= 2*(base+altura);
		
		areaRectangulo=base*altura; 	
		
		System.out.printf("El perímetro de tu rectángulo es: %.2f cm. " ,  perimetroRectangulo);
		System.out.printf("Y su area es de: %.2f cm." , areaRectangulo);
		
		System.out.println("Ahora vamos a usar el teorema de Pitágoras. Dime el valor del cateto 1: ");
		
		cateto1=entrada.nextInt();
		
		System.out.println("Dime el valor del cateto 2: ");
		
		cateto2=entrada.nextInt();
		
		double catetos=(cateto1*cateto1)+(cateto2*cateto2);
		
		System.out.printf("El valor de la hipotenusa al cuadrado es: %.2f " , catetos );
		
		System.out.printf ( "por lo tanto el valor de la hipotenusa es: %.2f " , Math.sqrt(cateto1*cateto1+cateto2*cateto2)); 
	
		
		
		
		
		
		
	}
	
}
