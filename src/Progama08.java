import java.util.Scanner;
public class Progama08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int dia;
		System.out.println("Ingrese el numero del dia de la semana que quiere: ");
		dia =leer.nextInt();
		switch(dia)
		{
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Ingreso un numero invalido");
			break;
		}
	}

}
