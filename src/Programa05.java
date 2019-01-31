import java.util.Scanner;
public class Programa05 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner leer= new Scanner(System.in);
		double cal;
		System.out.println("Cual es la calificacionm que tienes? ");
		cal=leer.nextDouble();
		if (cal>=80)
		{
			System.out.println("APROVADO");
		}
		else
		{
			System.out.println("REPROBADO");
		}

	}

}
