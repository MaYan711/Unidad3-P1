import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int n1, sig;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un Numero");

        n1 = sc.nextInt();
        sig = n1 + 1;
        System.out.println("El numero que le sigue " + n1 + " es: " + sig);
    }
}