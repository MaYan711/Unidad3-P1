import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double tCel, tFar;

        System.out.println("Ingrese su temperatura en Celsius");
        tCel = scanner.nextDouble();
        tFar = (tCel * (9/5)) + 32;
        System.out.println("La temperatura en Farhenheit: " + tFar);
    }
}