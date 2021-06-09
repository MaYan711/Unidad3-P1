  import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String pais;
		String capital;

		System.out.print("Ingrese el pais: ");
		pais = scanner.nextLine();

		System.out.print("Ingrese la capital: ");
		capital = scanner.nextLine();

		System.out.println(capital + " es la capital de: " + pais);
	}
}