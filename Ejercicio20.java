import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String num;
		int d1, d2, d3, d4, d5;
		System.out.print("Ingrese un numero de 5 digitos: ");
		num = sc.nextLine();

		d1 = Integer.parseInt(num.substring(0,1));
		d2 = Integer.parseInt(num.substring(1,2));
		d3 = Integer.parseInt(num.substring(2,3));
		d4 = Integer.parseInt(num.substring(3,4));
		d5 = Integer.parseInt(num.substring(4,5));
		if (d1 == d5 && d2 == d4){
			System.out.println("Es capicua");
		} 
		else {
			System.out.println("No es capicua");
		}
	}
}