import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero positivo: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero positivo: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número entero positivo: ");
        int num3 = scanner.nextInt();

        int menor = Math.min(Math.min(num1, num2), num3);
        int mayor = Math.max(Math.max(num1, num2), num3);

        System.out.println("El menor número es: " + menor);
        System.out.println("El mayor número es: " + mayor);

        scanner.close();
    }
}
