import java.util.Scanner;
public class Programa13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resp,np,ni=0,ac=0;
		do {
			Scanner leer =new Scanner(System.in);
			System.out.println("Ingrese el numero de pares que quiere sumar");
			np=leer.nextInt();
			for (int i = 0; i < np; i++) 
			{
				System.out.println(ni);
				ac+=ni;
				ni+=2;
			}
			System.out.println("La suma de los numeros es: " + ac);
			System.out.println("Quieres hacer otra suma(1=si, 2=no)");
			resp=leer.nextInt();
		} while (resp==1);
	}

}
