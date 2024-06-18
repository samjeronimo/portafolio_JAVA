package conversor;
import mis_metodos.MisMetodos;

import java.util.Scanner;

public class Grados {
        public static void grados() {

            MisMetodos.imprimirLinea();
            System.out.println();
            String[] operaciones = {"Celsius a Fahrenheit ", "Fahrenheit a Celsius"};

            for (int i = 0; i < operaciones.length; i++) {
                System.out.printf("[%d] %s ", i + 1, operaciones[i]);

                for (int j = 0; j < (12 - operaciones[i].length()); j++) {
                    System.out.print(" ");
                }

                if ((i + 1) % 2 == 0) {  //CANTIDAD DE COLUMNAS
                    System.out.println("");
                }

            }

            MisMetodos.imprimirLinea();

            Scanner opcionAelegir = new Scanner(System.in);
            System.out.print("[?]: ");
            int opcion = opcionAelegir.nextInt();

            MisMetodos.imprimirLinea();

            System.out.println();
            switch (opcion) {
                case 1:
                    Scanner temperatura = new Scanner(System.in);
                    System.out.print("Ingrese la temperatura: ");
                    double res = temperatura.nextDouble();
                    double resultado = (res * 9/5) + 32;
                    System.out.println("resultado en Fahrenheit: " + resultado);

                    MisMetodos.imprimirLinea();
                    break;

                case 2:
                    Scanner temperatura1 = new Scanner(System.in);
                    System.out.print("Ingrese la remperatura: ");
                    double dato = temperatura1.nextDouble();
                    double res2 = (dato * 5 / 8) + 34;
                    System.out.println("resultado en Celsius: " + res2);

                    MisMetodos.imprimirLinea();
                    break;
            }
        }
    }
