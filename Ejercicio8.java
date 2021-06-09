import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, pro;
        System.out.println("Ingrese el primero");
        n1 = sc.nextInt();

        System.out.println("Ingrese el segundo");
        n2 = sc.nextInt();

        System.out.println("Ingrese el tercero");
        n3 = sc.nextInt();
        
        pro = (n1 + n2 + n3) / 3;
        System.out.println("El promedio es: " + pro);
    }
}