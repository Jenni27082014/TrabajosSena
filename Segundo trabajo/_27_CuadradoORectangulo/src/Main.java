import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del cuadrilátero: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del cuadrilátero: ");
        double altura = scanner.nextDouble();

        if (base > 0 && altura > 0) {
            if (base == altura) {
                System.out.println("La figura es un cuadrado.");
            } else {
                System.out.println("La figura es un rectángulo.");
            }

            double perimetro = 2 * (base + altura);
            double superficie = base * altura;

            System.out.println("Perímetro: " + perimetro);
            System.out.println("Superficie: " + superficie);
        } else {
            System.out.println("Las dimensiones deben ser valores positivos.");
        }

        scanner.close();
    }
}
