package proyecto01_sesion2;
import java.util.Scanner;
public class Programa02 {
 public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos del usuario
        Scanner sc = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un numero para calcular su raiz cuadrada: ");
        double numero = sc.nextDouble();  
        
        // Calcular la raíz cuadrada
        if (numero >= 0) {
            double raiz = Math.sqrt(numero);
            // Mostrar el resultado
            System.out.println("La raiz cuadrada de " + numero + " es: " + raiz);
        } else {
            // Si el número es negativo, mostrar mensaje de error
            System.out.println("No se puede calcular la raiz cuadrada de un numero negativo.");
        }
        
        // Cerrar el Scanner
        sc.close();
    }
}