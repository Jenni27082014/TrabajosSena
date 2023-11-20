import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número A: ");
        double A = scanner.nextDouble();

        System.out.print("Ingrese el número B: ");
        double B = scanner.nextDouble();

        if (B != 0) {
            double cociente = A / B;
            System.out.println("El cociente entre A y B es: " + cociente);
        } else {
            System.out.println("La división por cero no está definida. No es posible calcular el cociente.");
        }

        scanner.close();
    }
}
