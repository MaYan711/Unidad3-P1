  import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bas, alt, per, are;
        System.out.print("Base del rectangulo: ");
        bas = sc.nextDouble();

        System.out.print("Altura del rectangulo: ");
        alt = sc.nextDouble();

        are = bas * alt;
        per = (2 * bas) + (2 * alt);
        System.out.print("El area del rectangulo es: " + are + " con un perimetro de: " + per);
        }
}