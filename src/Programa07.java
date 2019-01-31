import java.util.Scanner;
public class Programa07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer= new Scanner(System.in);
		double grados,c;
		System.out.println("Cual es la temperatura en grados Fahrenheit?");
		grados= leer.nextDouble();
		System.out.println("La temperatura en grados Fahrenheit es: "+ grados);
		c=(grados-32)/1.8;
		System.out.println("La temperatura en grados Celcius es: "+ c);
		
	}
}
