import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número A: ");
        double A = scanner.nextDouble();

        System.out.print("Ingrese el número B: ");
        double B = scanner.nextDouble();

        if (A < 0 || B < 0) {
            double suma = A + B;
            System.out.println("Al menos uno de los números es negativo. La suma es: " + suma);
        } else {
            double producto = A * B;
            System.out.println("Ambos números son no negativos. El producto es: " + producto);
        }

        scanner.close();
    }
}
