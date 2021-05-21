import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre" };
        List<String> intereses = new ArrayList<String>();

        int año;
        double abono, total = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos años va a ñadir");
        año = scanner.nextInt();
        if (!(año <= 0)) {

            for (int i = 1; i <= año; i++) {
                for (int j = 0; j < meses.length; j++) {
                    System.out.println("Mes " + meses[j]);
                    System.out.println("Cuantos va a abonar");
                    abono = scanner.nextDouble();
                    total += abono;
                    if (meses[j] == "Diciembre") {
                        intereses.add("Total con interes del año " + i + " total: " + (total * 1.1));
                        total = 0;
                        abono = 0;
                    }
                }
            }
            System.out.println("Modified ArrayList:\n" + intereses + "\n");
        } else {
            System.out.println("No hay años negativos");
        }

    }
}
