import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int l1, l2, l3;
		System.out.print("Ingrese el primer lado: ");
		l1 = sc.nextInt();

		System.out.print("Ingrese el segundo lado: ");
		l2 = sc.nextInt();

		System.out.print("Ingrese el tercer lado: ");
		l3 = sc.nextInt();

		if (l1 == l2) &&  (l2  == l3) {
			System.out.println("Equilatero");

		} 
		else if (l1 != l2) && (l2 != l3){
			System.out.println("Escaleno");
			
		} 
		else {
			System.out.println("Isoceles");
		}
    }
}