import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        double radio;
        double circunferencia;
        double area;

        Scanner scanner = new Scanner(System.in);
        System.out.print( "Ingrese el radio a calcular " );
        radio = scanner.nextDouble();
        circunferencia= 2*3.14*radio;
        area= 3.14*radio*radio;

        System.out.print ( "La circunferencia calculada para el radio "+ radio+" es: "+ circunferencia +" y el area de este circulo es: " + area );

    }
}