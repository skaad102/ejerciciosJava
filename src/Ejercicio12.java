import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int option;
        double pesiIni,pesoVasculas = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido...");

        do {
            System.out.println("Selecciona una opción:");
            System.out.println("1 ********* pesar personas");
            System.out.println("2 ********* salir");
            System.out.println();
            option = scanner.nextInt();

            if ((option == 1)) {
                System.out.println("Peso Inicial (kg)");
                pesiIni = scanner.nextDouble();
                System.out.println();
                pesarVascula(pesiIni,pesoVasculas);
            } else {
                System.out.println("opcion no valida:");

            }

        } while (option != 2);
    }

    static void pesarVascula(double pesiIni, double pesoVasculas) {
        Scanner scanner = new Scanner(System.in);
        double prom,dif;

        for (int i = 0; i < 10; i++) {
            System.out.println("Peso (kg) en la vascula #: "+(i+1));
                pesoVasculas += scanner.nextDouble();
            }
        prom = pesoVasculas/10;
        dif = -(pesiIni - prom);
        if(prom>pesiIni){
            System.out.println("SUBIO +" +dif);
        }else{
            System.out.println("BAJO " +dif);
        }
    }

}