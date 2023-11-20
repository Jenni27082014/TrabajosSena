import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        float resultado;
                float base;
                        float altura;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la base: ");
        base  = scanner.nextFloat();

        System.out.print("ingrese la altura: ");
        altura = scanner.nextFloat();

        resultado = (base * altura) / 2;
        System.out.print("el resultado es: " + resultado);





    }
}