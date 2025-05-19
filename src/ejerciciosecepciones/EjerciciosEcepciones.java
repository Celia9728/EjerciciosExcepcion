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
        // Ejercicio 2.
        boolean numeradorCorrecto = false;
        boolean denominadorCorrecto = false;

        int numerador = 0;
        int denominador = 0;

        // PEDIR NUMERADOR
        do {
            try {
                System.out.println("Introduce el numerador.");
                numerador = consola.nextInt();
                if (numerador > 100) {
                    throw new IllegalArgumentException("El numerador debe de ser mayor al denominador");
                }
                
                if (numerador == 0) {
                    throw new IllegalArgumentException("El numerador no debe de ser 0");
                }

                numeradorCorrecto = true;
            } catch (InputMismatchException e) {
                System.out.println("Caracteres no!");
                consola.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                consola.nextLine();
            }
        } while (!numeradorCorrecto);

        // PEDIR DENOMINADOR
        do {
            try {
                System.out.println("Introduce el denominador.");
                denominador = consola.nextInt();
                if (denominador < -5) {
                    throw new IllegalArgumentException("El denominador debe de ser mayor de -5");
                }
                
                if (denominador == 0) {
                    throw new IllegalArgumentException("El denominador no debe de ser 0");
                }
                denominadorCorrecto = true;
            } catch (InputMismatchException e) {
                System.out.println("Caracteres no!");
                consola.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                consola.nextLine();
            }
        } while (!denominadorCorrecto);

        // CALCULAR NUMERADOR Y DENOMINADOR.
        int resultado = numerador / denominador;
        System.out.println(resultado);
        
        // Ejercicio 3.
        
        
        
    }

}
