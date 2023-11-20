import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número A: ");
        double A = scanner.nextDouble();

        System.out.print("Ingrese el número B: ");
        double B = scanner.nextDouble();

        if (A < B) {
            double resultadoSuma = A + B;
            System.out.println("A es menor que B. La suma es: " + resultadoSuma);
        } else {
            double resultadoResta = A - B;
            System.out.println("A es mayor o igual que B. La resta es: " + resultadoResta);
        }

        scanner.close();
    }
}
