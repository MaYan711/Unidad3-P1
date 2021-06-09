import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, res;
        num = (int)(Math.random()* 100 + 1);
        System.out.println("El aleatorio es: " + num);
        res = num % 5;

        if(res == 0 && num <= 25){
            System.out.println("Correcto");
        }
        else{
            System.out.println("Incorrecto");
        }
    }
}