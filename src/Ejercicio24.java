import java.util.ArrayList;
import java.util.Random;

public class Ejercicio24 {
    public static void main(String[] args) {
        ArrayList<String> empleados = new ArrayList<String>();
        empleados.add("Pepe");
        empleados.add("Sofia");
        empleados.add("Camilo");
        empleados.add("Paco");
        empleados.add("Lucia");

        ArrayList<Double> sueldos = new ArrayList<Double>();
        sueldos.add((double) 1500);
        sueldos.add((double) 2500);
        sueldos.add((double) 3500);
        sueldos.add((double) 4500);
        sueldos.add((double) 5500);

        ArrayList<Double> horas = new ArrayList<Double>();
        double pagoEmpresa = 0;

        // int[persona][dias]
        int[][] planilla = new int[5][6];
        llenarHoras(planilla);
        visualizar(planilla);
        sumarHoras(planilla, empleados, horas);
        calcularSueldo(horas, empleados, sueldos, pagoEmpresa);
        visualizardos(planilla, empleados);

    }

    static void visualizardos(int[][] planilla, ArrayList<String> empleados) {
        int mayor = 0;
        int pos = 0;
        for (int i = 0; i < planilla.length; i++) {
            if (planilla[i][0] > mayor) {
                pos = i;
                mayor = planilla[i][0];
            }
        }
        System.out.println("El empleado " + empleados.get(pos) + " trabajo más el día lunes");
    }

    private static void calcularSueldo(ArrayList<Double> horas, ArrayList<String> empleados, ArrayList<Double> sueldos,
            double pagoEmpresa) {
        for (int i = 0; i < 5; i++) {
            double pago = sueldos.get(i) * horas.get(i);
            System.out.println("Pagar : $" + pago + " a : " + empleados.get(i));
            pagoEmpresa += pago;
        }
        System.out.println("La empresa debe pagar $" + pagoEmpresa);
    }

    static void sumarHoras(int[][] planilla, ArrayList<String> empleados, ArrayList<Double> horas) {
        for (int i = 0; i < 5; i++) {
            int suma = 0;
            for (int j = 0; j < 6; j++) {
                suma += planilla[i][j];
            }
            System.out.println("la horas trabajadas por " + empleados.get(i) + " fueron: " + suma);
            horas.add((double) suma);
        }
    }

    static void visualizar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void llenarHoras(int[][] planilla) {
        Random r = new Random();
        for (int i = 0; i < planilla.length; i++) {
            for (int j = 0; j < planilla[i].length; j++) {
                planilla[i][j] = r.nextInt(25) + 1;
            }
        }
    }
}
