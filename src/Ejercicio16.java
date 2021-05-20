import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion, numpersonas, edad;
        int hom = 0;
        int muj = 0;


        String sexo;
        String[] mujer = { "mujer", "MUJER", "M", "m", "f", "F" };
        String[] hombre = { "hombre", "HOMBRE", "H", "h" };

        ArrayList<Integer> edades = new ArrayList<Integer>();

        

        System.out.println("Bienvenido...");
        do {
            System.out.println("Selecciona una opción:");
            System.out.println("1 ********* añadir personas");
            System.out.println("2 ********* catidad de personas");
            System.out.println("3 ********* Mayor y menor edad");
            System.out.println("4 ********* Salir");

            System.out.println(" ");
            System.out.println("Ingresa Opción");

            opcion = scanner.nextInt();

            if (!((opcion < 0) || (opcion > 5))) {

                if (opcion == 1) {
                    System.out.println("Cuantas personas");
                    numpersonas = scanner.nextInt();

                    for (int per = 0; per < numpersonas; per++) {
                        System.out.println("Persona " + (per + 1) + ": ");
                        System.out.println("Edad");
                        edad = scanner.nextInt();
                        
                        edades.add(edad);

                        System.out.println("Sexo");
                        sexo = scanner.next();

                        if (searchList(mujer, sexo)) {
                            muj += 1;
                        } else if (searchList(hombre, sexo)) {
                            hom += 1;
                        } else {
                            System.out.println("No contada");
                        }

                    }
                } else if (opcion == 2) {
                    System.out.println("Total personas " + (hom + muj));
                    System.out.println("Total Hombre " + hom);
                    System.out.println("Total Mujeres " + muj);

                } else {
                    System.out.println("Edad Mayor " + Collections.max(edades));
                    System.out.println("Edad Menor " + Collections.min(edades));

                }
            } else {
                System.out.println(" ");
                System.out.println("No Exite opcion para ese valor");
                System.out.println(" ");

            }

        } while (opcion != 4);
    }

    private static boolean searchList(String[] strings, String searchString) {
        return Arrays.asList(strings).contains(searchString);
    }

}
