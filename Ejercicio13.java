import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double rad, alt, vol;
        System.out.println("Radio del cilindo: ");
        rad = scanner.nextDouble();

        System.out.println("Altura del cilindro: ");
        alt = scanner.nextDouble();

        if (rad > 0 && alt > 0) {
            vol = (Math.PI) * (rad * rad) * (alt);
            System.out.println("El volumen del cilindro es de: " + vol);
        }
        else {
            System.out.println("Ingrese un numero mayor a 0");
        }
    }
}