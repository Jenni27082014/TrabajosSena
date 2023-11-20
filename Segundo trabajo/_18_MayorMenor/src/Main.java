import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("El primer número es mayor que el segundo.");
            System.out.println("El segundo número es menor que el primero.");
        } else if (num2 > num1) {
            System.out.println("El segundo número es mayor que el primero.");
            System.out.println("El primer número es menor que el segundo.");
        } else {
            System.out.println("Ambos números son iguales.");
        }

        scanner.close();
    }
}
