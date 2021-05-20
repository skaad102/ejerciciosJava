import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float precio,ancho,largo,total,area;
        System.out.println("Ingresa un precio de ($)");
        precio = scanner.nextFloat();

        System.out.println("Ingresa la ancho (m)");
        ancho = scanner.nextFloat();

        System.out.println("Ingresa un largo (m)");
        largo = scanner.nextFloat();

        area = ancho*largo;

        total = area*precio;

        System.out.println("Area del terreno "+area+" (m2)");
        System.out.println("Precio Total $ "+total+" (m2)");
        
    }
}
