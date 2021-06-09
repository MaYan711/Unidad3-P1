import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args){
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el nuemero a evaluar: ");
		num = scanner.nextInt();

		if(num == 0){
			System.out.println("Es nulo");

		}
		else if(num > 0){

			System.out.println("Es positivo");

		}
		else{

			System.out.println("Es negativo");
		}
	}
}