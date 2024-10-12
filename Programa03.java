package proyecto01_sesion2;

import java.util.Scanner;

public class Programa03 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero decimal: ");
        double numero = scanner.nextDouble();
        long redondeado = Math.round(numero);
        System.out.println("El numero redondeado es: " + redondeado);
    }
}