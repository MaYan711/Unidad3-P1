import java.util.*;

public class Ejercicio6 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double num, por, nue;

		num = Math.random() * 200 + 1;
		System.out.println("El algoritmo genero el numero " + num);
		por = num * .30;
		nue = num + por;
		System.out.println(num + " aumentado en un 30% es " + nue);
	}
}