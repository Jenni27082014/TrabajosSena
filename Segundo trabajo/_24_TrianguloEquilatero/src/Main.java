import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer lado del triángulo: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del segundo lado del triángulo: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del tercer lado del triángulo: ");
        double lado3 = scanner.nextDouble();

        if (lado1 > 0 && lado2 > 0 && lado3 > 0) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es equilátero.");
            } else {
                System.out.println("El triángulo no es equilátero.");
            }
        } else {
            System.out.println("Las longitudes de los lados deben ser positivas.");
        }

        scanner.close();
    }
}
