import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        int n1, cua, cub;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un Numero");
        n1 = sc.nextInt();
        cua = n1 * n1;
        cub= n1 * n1 * n1;

        System.out.println("El cuadrado de " + n1 + " es: "+ cua);
        System.out.println("El cubo de "+ n1 +" es: " + cub);
    }
}