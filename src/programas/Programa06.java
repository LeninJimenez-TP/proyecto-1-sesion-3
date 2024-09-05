
package programas;
import java.util.Scanner;
public class Programa06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //entrada de datos
        System.out.println("Ingresa la longitud de los tres lados del triángulo:");
        double lado1 = scanner.nextDouble();
        double lado2 = scanner.nextDouble();
        double lado3 = scanner.nextDouble();
        //proceso de datos
        String tipoTriangulo;

        if (lado1 == lado2 && lado2 == lado3) {
            tipoTriangulo = "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            tipoTriangulo = "Isósceles";
        } else {
            tipoTriangulo = "Escaleno";
        }
        //salida de datos
        System.out.println("El triángulo es de tipo " + tipoTriangulo + ".");
        }
    }
