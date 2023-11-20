import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        double lado;
        double resultadoarea;
        double resultadoperimetro;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Halle el valor de un lado del cuadro ");
        lado = scanner.nextDouble();

        resultadoarea = lado * lado;
        resultadoperimetro = 4 * lado;
        System.out.print("El valor del area es " + resultadoarea + " cm2 "  + " Perimetro es igual a " + resultadoperimetro + "cm");
    }
}