import java.util.Scanner;

public class Programa12a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		byte ventas,i,veces;
		double prod,prom;
		int acum;
		System.out.println("Ingrese el numero de ventas que ha realizado: ");
		ventas=leer.nextByte();
		i=1;
		veces=1;
		acum=0;
		do 
		{
			System.out.println("ingrese el precio del  producto "+ i +": ");
			prod =leer.nextDouble();
			if (prod>=0 && prod <=200)
			{
				System.out.println("El precio del  producto "+ i +" es: " + prod);
				acum+=veces;
				veces++;
			}
			if(prod>200 && prod<=400)
			{
				System.out.println("El precio del  producto "+ i +" es: " + prod);
				acum+=veces;
				veces++;
			}
			i++;
		} while (i<=ventas);
		
	}

}
