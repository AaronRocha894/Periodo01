import java.util.Scanner;
public class Programa12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		byte Ncal,i;
		double cal,prom;
		System.out.println("Proporciona el numero de calificaciones");
		Ncal=leer.nextByte();
		i=1;
		double acum=0;
		do 
		{
			System.out.println("Ingresa la calificacion "+ i +":");
			cal =leer.nextDouble();
			
			acum+=cal;
			i++;
		} while (i<=Ncal);
		prom=(acum/Ncal);
		if(prom>=0 && prom<=49)
		{
			System.out.println("Suspenso");
		}
		if(prom>=50 && prom<=69 )
		{
			System.out.println("Aprovado");
		}
		else
		if(prom>=70 && prom<=89)
		{
			System.out.println("Notable");
		}
		if(prom>=90 && prom<=99)
		{
			System.out.println("Sobresaliente");
		}
		if(prom==100)
		{
			System.out.println("Matricula de honor");
		}
	}

}