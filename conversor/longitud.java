package conversor;


import mis_metodos.MisMetodos;

import java.util.Scanner;

public class longitud {

    public static double CalConversiones(int kilometros) {

        double conversiones = kilometros * 1000;
        return conversiones;
    }

    public static float CalConversion2(int metros){
        float conversiones2 = metros / 1000f;
        return conversiones2;
    }

    //ORDENA LAS OPCIONES A ELEGIR
    public static void cargarOperaciones() {
        String[] listaDeOperaciones = {
                "Kilometros a Metros", "Metros a Kilometros"
        };

        for (int i = 0; i < listaDeOperaciones.length; i++) {
            System.out.printf("[%d] %s      ", i + 1, listaDeOperaciones[i]);

            for (int j = 0; j < (19 - listaDeOperaciones[i].length()); j++) {
                System.out.print(" ");
            }

            if ((i + 1) % 2 == 0) {
                System.out.println(" ");
            }
        }

        //PIDE QUE ELIGA UNA OPCION DE CONVERSION
        Scanner intOpcion2 = new Scanner(System.in);
        System.out.print("[?]: ");
        int opcion2 = intOpcion2.nextInt();

        MisMetodos.imprimirLinea();

        switch (opcion2){
            case 1:
                longitud.conversion1_();
                MisMetodos.imprimirLinea();
                break;
            case 2:
                longitud.conversion2_();
                MisMetodos.imprimirLinea();
                break;

        }

    }

    //HACE LA CONVERSION
    public static void conversion1_(){
        Scanner intoDato3 = new Scanner(System.in);
        System.out.print("Ingresa tu medida: ");
        int medida = intoDato3.nextInt();

        MisMetodos.imprimirLinea();

        double conversion =CalConversiones(medida);
        System.out.println("De kilometros a Metros son: " + conversion);

        MisMetodos.imprimirLinea();
    }

    //HACE LA CONVERSION
    public static void conversion2_(){
        Scanner intoDato4 = new Scanner(System.in);
        System.out.print("Ingresa tu medida: ");
        int medida2 = intoDato4.nextInt();

        MisMetodos.imprimirLinea();

        float conversion = CalConversion2(medida2);
        System.out.println("De kilometros a Metros son: " + conversion);

        MisMetodos.imprimirLinea();
    }
}