import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int n1, n2, Res;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        n1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        n2 = sc.nextInt();

        Res = n1 + n2;
        System.out.println("La suma es : " + Res);
    }
}