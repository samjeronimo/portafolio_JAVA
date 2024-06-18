package conversor;

import mis_metodos.MisMetodos;

import java.util.Scanner;

public class conversor_de_moneda {

    public static void conversor() {

        Scanner nombre = new Scanner(System.in);
        System.out.print("[Moneda]");
        int r324 = nombre.nextInt();

        String[] listaDeOpciones = {
                "Quetzales--Dólares", "Dólares--Quetzales",
                "Quetzales--Pesos Mexicanos", "Pesos Mexicanos--Quetzales"
        };


        for (int i = 0; i < listaDeOpciones.length; i++) {
            System.out.printf("[%d] %s", i + 1, listaDeOpciones[i]);

            for (int j = 0; j < (28 - listaDeOpciones[i].length()); j++) {
                System.out.print(" ");
            }

            if ((i + 1) % 2 == 0) {
                System.out.println("");
            }
        }

        Scanner signo = new Scanner(System.in);
        System.out.print("[?]: ");
        int r = signo.nextInt();

        MisMetodos.imprimirLinea();

        switch (r) {
            case 1:
                Scanner Q = new Scanner(System.in);
                System.out.print("Ingresa la cantidad: ");
                double res_Q = Q.nextDouble();

                System.out.println("Resultado en Dólares: " + quetzalesDolares(res_Q));

                MisMetodos.imprimirLinea();
                break;

            case 2:
                Scanner Dolar = new Scanner(System.in);
                System.out.print("Ingresa la cantidad: ");
                double res_dolar = Dolar.nextDouble();

                System.out.println("Resultado en Quetzales: " + dolaresQuetzales(res_dolar));

                MisMetodos.imprimirLinea();
                break;

            case 3:
                Scanner Quetzales_Pesos = new Scanner(System.in);
                System.out.print("Ingresa la cantidad: ");
                double res_Quetzales = Quetzales_Pesos.nextDouble();

                System.out.println("Resultado en Pesos: " + quetzalesPesosMX(res_Quetzales));

                MisMetodos.imprimirLinea();
                break;

            case 4:
                Scanner pesos_Quetzales = new Scanner(System.in);
                System.out.print("Ingresa la cantidad: ");
                double res_pesos = pesos_Quetzales.nextDouble();

                System.out.println("Resultado en Quetzales: " + pesosMXQuetzales(res_pesos));

                MisMetodos.imprimirLinea();
                break;
        }
    }

    //FUNCIONES
    public static double quetzalesDolares(double quetzales) {
        double dolares = quetzales * (1 / 7.5);
        return dolares;
    }

    public static double dolaresQuetzales(double dolares) {
        double quetzales = dolares * (1 / 7.8);
        return quetzales;
    }

    public static double quetzalesPesosMX(double quetzales){
        double pesosMX = quetzales * (1 / 2.4);
        return pesosMX;
    }

    public static double pesosMXQuetzales(double pesos){
        double quetzales = pesos * (1 / 0.4);
        return quetzales;
    }
}