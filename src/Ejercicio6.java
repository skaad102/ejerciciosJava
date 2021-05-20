import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int hora,precio;
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuatas horas va a cobrar?");
        hora = scanner.nextInt();

        if (hora < -1) {
            System.out.println("Hora no valida");
        }
        if (hora <= 2) {
            System.out.println("Cobrar $" + hora * 5);
        }
        if (hora <= 5) {
            precio = 10 + (hora-2)*4;
            System.out.println("Cobrar $" + precio);
        }
        if ((hora < 10) && (hora > 5)) {
            precio = 22 + (hora-5)*3;
            System.out.println("Cobrar $" + precio);
        }
        if (hora > 10) {
            precio = 37 + (hora-10)*2;
            System.out.println("Cobrar $" + precio);
        }
        
    }
}
