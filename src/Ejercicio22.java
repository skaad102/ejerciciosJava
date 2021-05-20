import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Ejercicio22 {
    public static void main(String[] args) {
        ArrayList<String> Nombres = new ArrayList<String>();
        ArrayList<Integer> Edades = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        String nombre;
        int edad,id;



        for (int alum = 0; alum < 3; alum++) {
            System.out.println("Ingresa el nombre");
            nombre = scanner.next();
            Nombres.add(nombre);
            System.out.println("Ingresa la edad");
            edad = scanner.nextInt();
            Edades.add(edad);
        }

        id = Edades.indexOf(Collections.max(Edades));

        System.out.println("Edad Mayor " + Collections.max(Edades));
        System.out.println("Nombre " + Nombres.get(id) );
    }


}
