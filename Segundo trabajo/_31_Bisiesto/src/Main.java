import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int year = scanner.nextInt();

        boolean esBisiesto = determinarSiEsBisiesto(year);

        if (esBisiesto) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }

        scanner.close();
    }

    public static boolean determinarSiEsBisiesto(int year) {
        // Un año es bisiesto si es divisible por 4, pero no por 100, a menos que también sea divisible por 400.
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
