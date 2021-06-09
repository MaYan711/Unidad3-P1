import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n1, n2, Res;
		System.out.print("Ingrese divisor: ");
		n1 = sc.nextInt();

		System.out.print("Ingrese dividendo: ");
		n2 = sc.nextInt();

		if (n2 % n1 == 0) {
			Res = (n2 / n1);
			System.out.println("La division exacta es: " + Res);
		} 
		else {
			System.out.println("No es exacta");
		}
    }
}