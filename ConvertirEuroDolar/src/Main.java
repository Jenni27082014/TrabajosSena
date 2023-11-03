import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        double dolar=1.0569907;
        double euro;
        double resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Ingrese valor en euro  ");
        euro = scanner.nextDouble();


       resultado= dolar* euro;
System.out.print("Usted tiene  " + resultado + " dolares " );


    }
}