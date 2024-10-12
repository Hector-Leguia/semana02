package proyecto01_sesion2;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese el exponente: ");
        double exponente = scanner.nextDouble();
        double potencia = Math.pow(base, exponente);
        System.out.println(base + " elevado a " + exponente + " es: " + potencia);
    }
}
