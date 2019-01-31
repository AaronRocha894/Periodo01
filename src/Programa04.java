import java.util.Scanner;
public class Programa04 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner leer= new Scanner(System.in);
		byte edad;
		System.out.println("Cual es tu edad? ");
		edad=leer.nextByte();
		if (edad>18)
		{
			System.out.println("Tu eres mayor de edad");
		}

	}

}
