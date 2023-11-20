import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio de la venta: $");
        double precioVenta = scanner.nextDouble();

        double descuento;

        if (precioVenta < 100) {
            descuento = 0.05 * precioVenta;
        } else if (precioVenta >= 100 && precioVenta < 200) {
            descuento = 0.10 * precioVenta;
        } else {
            descuento = 0.15 * precioVenta;
        }

        double precioFinal = precioVenta - descuento;

        System.out.println("Descuento realizado: $" + descuento);
        System.out.println("Precio final con descuento: $" + precioFinal);

        scanner.close();
    }
}
