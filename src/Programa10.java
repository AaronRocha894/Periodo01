import java.util.Scanner;
import java.text.DecimalFormat;
public class Programa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		DecimalFormat formateador=new DecimalFormat("###,###.##");
		double p1,p2,p3,inc,suma;
		System.out.println("Cual es el precio del producto 1");
		p1=leer.nextDouble();
		System.out.println("Cual es el precio del producto 2");
		p2=leer.nextDouble();
		System.out.println("Cual es el precio del producto 3");
		p3=leer.nextDouble();
		suma=p1+p2+p3;
		System.out.println("La suma total es de :");
		System.out.println(formateador.format(suma));
		if (suma>=1500)
		{
			System.out.println("El descuento sera del 11%");
			inc=suma*.11;
			System.out.println("El descuento de " + suma + " es " + formateador.format(inc));
			suma+=-inc;
			System.out.println("El total a pagar es " + formateador.format(suma));
		}
		else
		{
			System.out.println("El descuento sera del 10%");
			inc=suma*.10;
			System.out.println("El descuento de " + suma + " es " + formateador.format(inc));
			suma+=-inc;
			System.out.println("El total a pagar es " + formateador.format(suma));
		}
	}

}
