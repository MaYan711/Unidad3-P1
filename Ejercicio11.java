import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args){
		double cm,mt, yd, ft, plg;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese los cm que desea convertir: ");
		cm = scanner.nextDouble();
		mt = cm / 100;
		yd = cm / 91.44;
		ft = cm /30.48;
		plg = cm / 2.54;

		System.out.println("En metros son: " + mt);
		System.out.println("En yardas son: " + yd);
		System.out.println("En pies son: " + ft);
		System.out.println("En pulgadas son: " + plg);
	}
}