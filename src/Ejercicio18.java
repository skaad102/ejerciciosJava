import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int empeados;
        double sueldo, comision, com1, com2, com3;

        System.out.println("Numero de empleados");
        empeados = scanner.nextInt();

        for (int i = 0; i < empeados; i++) {
            System.out.println();
            System.out.println("Sueldo base");
            sueldo = scanner.nextDouble();
            System.out.println("Comision 1");
            com1 = scanner.nextDouble();
            System.out.println("Comision 2");
            com2 = scanner.nextDouble();
            System.out.println("Comision 3");
            com3 = scanner.nextDouble();

            comision = (com1 + com2 + com3) * 0.1;

            System.out.println("Sueldo base " + sueldo);
            System.out.println("Comision " + comision);
            System.out.println("Total " + (comision + sueldo));

        }
    }
}
