import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pal, pal1, Aux;
        System.out.print("Primer palabra A: ");
        pal = sc.nextLine();

        System.out.print("Segunda palabra B: ");
        pal1 = sc.nextLine();
        Aux = pal;
        pal = pal1;
        pal1 = Aux;
        
        System.out.println("La palabra B era: " + pal);
        System.out.println("La palabra A era: " + pal1);
    }
}