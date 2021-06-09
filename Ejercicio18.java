import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args){
		int num, d, d1, d2, d3;
		String cad;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un numero de 4 digitos: ");
		num = scanner.nextInt();
		cad = Integer.toString(num);

		d = Integer.parseInt(cad.substring(0,1));
		d1 = Integer.parseInt(cad.substring(1,2));
		d2 = Integer.parseInt(cad.substring(2,3));
		d3 = Integer.parseInt(cad.substring(3,4));
		System.out.println("Primero = " + d + " Segundo = " + d2 + " Tercero = " + d2 + " Cuarto = " + d3);
		System.out.println("y la suma es: " + (d + d1 + d2 + d3)
	}
}