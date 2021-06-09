import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        int n1, doble, triple;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero que desea convertir");
        n1 = sc.nextInt();
        doble= n1 * 2;
        triple= n1 * 3;
        System.out.println("El doble de " + n1 + " es: " + doble);
        System.out.println("El triple de " + n1 + " es: "+ triple);
    }

}