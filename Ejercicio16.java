import java.util.Scanner;

public class Ejercicio16{

	public static void main(String[] args){
		int num, num1, num2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el primer numero: ");
		num = scanner.nextInt();

		System.out.print("Ingrese el segundo numero: ");
		num1 = scanner.nextInt();

		System.out.print("Ingrese el tercer numero: ");
		num2 = scanner.nextInt();


		if((num > num1) && (num > num2)){
			System.out.println(num + " es mayor");

		}
		else if((num1 > num) && (num1 > num2)){
			System.out.println(num1 + " es mayor");

		}
		else{
			System.out.println(num2 + " es mayor");
		}
	}
}