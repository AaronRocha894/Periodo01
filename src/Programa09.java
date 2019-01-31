import java.util.Scanner;
public class Programa09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int opc;
		Double pie,pul,conv;
		System.out.println("Pulgadas a centimetros");
		System.out.println("Pies a centimetros");
		System.out.println("Pies a pulgadas");
		System.out.println("Elige una opcion:");
		opc =leer.nextInt();
		switch(opc)
		{
		case 1:
			System.out.println("Pulgadas a centimetros");
			System.out.println("Ingresa el numero de pulgadas a convertir");
			pul=leer.nextDouble();
			conv=(pul*2.54);
			System.out.println("Pulgadas " + pul + " es gual a " + conv + " centimetros" );
			break;
		case 2:
			System.out.println("Pies a centimetros");
			System.out.println("Ingresa el numero de pies a convertir");
		    pie=leer.nextDouble();
			conv=(pie*30.48);
			System.out.println("Pies " + pie + " es gual a " + conv + " centimetros" );
			break;
		case 3:
			System.out.println("Pies a pulgadas");
			System.out.println("Ingresa el numero de pies a convertir");
			pie=leer.nextDouble();
			conv=(pie*12);
			System.out.println("Pies " + pie + " es gual a " + conv + " Pulgadas" );
			break;
		default:
			System.out.println("Ingreso una opcion invalida");
			break;
		}
	}

}
