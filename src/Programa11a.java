import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa11a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat formateador = new DecimalFormat("###,###.##");
		Scanner leer = new Scanner(System.in);
		byte Nempleados,i=0;
		double sueldo=0,maximo=0.0, minimo=999999999,total=0.0,isr=0.0;
		System.out.println("Proporciona el numero de empleados");
		Nempleados=leer.nextByte();
		maximo=sueldo;
		do {
			System.out.println("Ingresa el sueldo del empleado"+i+":");
			sueldo =leer.nextDouble();
			
			total+=sueldo;
			if(sueldo<minimo)
			{
				minimo=sueldo;
			}
			if(sueldo>maximo)
			{
				maximo=sueldo;
			}
			i++;
		} while (i<=Nempleados);
		isr = total*0.33;
		System.out.println("El total es:"+formateador.format(total));
		System.out.println("El ISR es:"+formateador.format(isr));
		System.out.println("Salario Maximo:"+formateador.format(maximo));
		System.out.println("Salario minimo:"+formateador.format(minimo));
	}

}
