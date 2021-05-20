import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);
        String fn;
        LocalDate fechaNacimiento;
        Period edad;
        int años;

        System.out.println("Fecha de nacimiento dd/MM/yyyy");
        fn = scanner.nextLine();
        if (fn.length() == 10) {

            fechaNacimiento = LocalDate.parse(fn, formatter);
            edad = Period.between(fechaNacimiento, LocalDate.now());
            años = edad.getYears();
            System.out.println(
                    String.format("%d meses, %d semanas, %d días y %d horas", años*12, años*52, años*365, años*8760 ));
        } else {
            System.out.println("ocurrio un error con el formato");
        }
    }
}
