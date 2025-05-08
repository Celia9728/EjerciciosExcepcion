package ejerciciosecepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjerciciosEcepciones {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // Ejercicio 1
        boolean longitudCorrecta = false;

        int longitud = 0;

        while (!longitudCorrecta) {
            try {
                System.out.println("Introduce el tamaño del array");
                longitud = consola.nextInt();
                if (longitud < 1) {
                    throw new NegativeArraySizeException("Numero negativos no!!");
                }
                longitudCorrecta = true;
            } catch (InputMismatchException e) {
                System.out.println("No es un numero.");
                consola.nextLine();
            } catch (Exception e) {
                System.out.println("Numero incorrecto.");
                consola.nextLine();
            }
        }

        double[] array = new double[longitud];

        for (int i = 0; i < array.length; i++) {
            boolean numeroValido = false;
            while (!numeroValido) {
                try {
                    System.out.println("Posicion: " + i);
                    array[i] = consola.nextDouble();
                    numeroValido = true;
                } catch (Exception e) {
                    System.out.println("Numero no valido");
                    consola.nextLine();
                }
            }
        }
    }

}
