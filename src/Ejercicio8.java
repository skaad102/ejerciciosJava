import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        double precioHora, total;
        int hora;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor de la hora");
        precioHora = scanner.nextDouble();
        System.out.println("Número de horas");
        hora = scanner.nextInt();

        if (!(hora > 50)) {
            if (hora <= 40) {
                System.out.println("Pagar $:" + hora * precioHora);
            }
            if ((hora >= 41) && (hora <= 45)) {
                total = precioHora*(40 + 2*(hora-40));
                System.out.println("Pagar $:" +total);
            }
            if ((hora >= 46) && (hora <= 50)) {
                total = precioHora*(50 + 3*(hora-45) );
                System.out.println("Pagar $:" +total);
            }
        } else {
            System.out.println("No es Permitido Trbajar más de 50 Horas");
        }
    }
}
