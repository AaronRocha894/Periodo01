import java.util.Scanner;

public class Programa03 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		String nombre;
		int edad;
		double estatura;
		System.out.println("Ingrese su nombre: ");
		nombre=leer.nextLine();
		System.out.println("Ingrese su edad: ");
		edad=leer.nextInt();
		System.out.println("Ingrese su estatura: ");
		estatura=leer.nextDouble();
		System.out.println("Hola "+ nombre+",tu edad es " + edad +" años"  +"y tu estatura es de " + estatura);
	}

}
