import java.util.*;

public class Ejercicio7 {

    public static void main(String[] args) {
       Random Aleatoreo = new Random();
		Scanner sc = new Scanner(System.in);
		int num;
		double numDis;
		num = Aleatoreo.nextInt(40) + 10;
		numDis = num * 0.85;
		System.out.print("El  random es " + num + ", y su disminuido en 15% es " + numDis);
    }
}