import java.util.Scanner;

public class Programa12b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer= new Scanner(System.in);
		int cli,i=1,mes,mas=0,menos=0,c = 0;
		double consumoMin,ac=0,prom;
		System.out.println("Ingrese el numero de cientes");
		cli=leer.nextInt();
		while(i <= cli)
		{
			mes=1;
			c++;
			System.out.println("Cliente " + c);
			do
			{
				System.out.println("ingrese el consumo en minutos de mes: " + mes);
				consumoMin=leer.nextInt();
				ac+=consumoMin;
				if(consumoMin>100)
				{
					mas++;
				}
				if(consumoMin<=100)
				{
					menos++;
				}
				mes++;
			}while(mes<=12);
			i++;
		}
			prom=ac/cli;
			System.out.println("El total de minutos es: " + ac);
			System.out.println("El promedio al año de minutos  es: " + prom);
			System.out.println("Los numero de meses que consumiero mas de 100 minutos es : " + mas);
			System.out.println("Los numero de meses que consumiero menos de 100 minutos es: " + menos);
	}

}
