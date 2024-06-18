package calculadora;

import mis_metodos.MisMetodos;

import java.util.Scanner;

public class edad {
        public static int edades(int res_edad, int res_edad2, int res_edad3, int res_actual, int res_actual1, int res_actual2) {
                int res = res_actual2 - res_edad3;

                if (res_actual1 < res_actual2 || (res_actual1 == res_actual2 && res_actual < res_edad)) {
                        res--;
                }
                return res;
        }

        public static void edad(){

                Scanner edad = new Scanner(System.in);
                System.out.print("Ingresa el dia en que naciste: ");
                int res_edad = edad.nextInt();

                MisMetodos.imprimirLinea();

                Scanner edad2 = new Scanner(System.in);
                System.out.print("Ingresa el mes en que naciste: ");
                int res_edad2 = edad2.nextInt();

                MisMetodos.imprimirLinea();

                Scanner edad3 = new Scanner(System.in);
                System.out.print("Ingresa el año en que naciste: ");
                int res_edad3 = edad3.nextInt();

                MisMetodos.imprimirLinea();

                Scanner fecha_actual = new Scanner(System.in);
                System.out.print("Ingresa el dia actual: ");
                int res_actual = fecha_actual.nextInt();

                MisMetodos.imprimirLinea();

                Scanner fecha_actual2 = new Scanner(System.in);
                System.out.print("Ingresa el mes actual: ");
                int res_actual1 = fecha_actual2.nextInt();

                MisMetodos.imprimirLinea();

                Scanner fecha_actual3 = new Scanner(System.in);
                System.out.print("Ingresa el año actual: ");
                int res_actual2 = fecha_actual3.nextInt();

                MisMetodos.imprimirLinea();

                int res = edades(res_edad, res_edad2, res_edad3, res_actual, res_actual1, res_actual2);

                System.out.println("Respuesta: " + res);
        }
}

