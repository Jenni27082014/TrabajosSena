import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int date1;
        int date2;
        int suma;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese primer numero ");
        date1 = scanner.nextInt();

        System.out.print("Ingrese segundo numero ");
        date2 = scanner.nextInt();

        suma = date1 + date2;
        System.out.print("El resultado de la suma es: " + suma);
    }
}


