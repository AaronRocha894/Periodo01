import java.util.Scanner;
import java.text.DecimalFormat;
public class Programa10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		DecimalFormat formateador=new DecimalFormat("###,###.##");
		double precio,inc,suma=0;
		int nProductos,i;
		i=1;
		System.out.println("Ingrese el numero de productos " );
		nProductos = leer.nextInt();
		do {
			System.out.println("Ingrese el precio del producto " + i);
			precio=leer.nextDouble();
			suma+=precio;
			i++;
		} while (i>0 && i<=nProductos);

		if (suma>=1500)
		{
			System.out.println("El descuento sera del 11%");
			inc=suma*.11;
			System.out.println("El descuento de " + suma + " es " + formateador.format(inc));
			suma=suma-inc;
			System.out.println("El total a pagar es " + formateador.format(suma));
		}
		else
		{
			System.out.println("El descuento sera del 10%");
			inc=suma*.10;
			System.out.println("El descuento de " + suma + " es " + formateador.format(inc));
			suma=suma-inc;
			System.out.println("El total a pagar es " + formateador.format(suma));
		}
	}

}
