import java.io.IOException;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) throws IOException {

        char[] vocales = { 'a', 'e', 'i', 'o', 'u' };
        char[] consonantes = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w',
                'x', 'y', 'z' };
        System.out.println("Introduce un carácter en la consola y pulsa intro");
        char c = (char) System.in.read();
        if (esUn(consonantes, c)) {
            System.out.println("Has insertado una consonante");
        } else if (esUn(vocales, c)) {
            System.out.println("Has insertado una vocal");
        } else {
            System.out.println("Has insertado algo que no es una consonante, ni una vocal");
        }
    }

    public static boolean esUn(char[] caracteres, char c) {
        return (new String(caracteres).indexOf(c) >= 0) ? true : false;
    }
}
