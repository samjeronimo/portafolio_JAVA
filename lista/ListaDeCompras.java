package lista;

import mis_metodos.MisMetodos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeCompras {

    //LISTA DE OPCIONES
    public static String[] opcion6 = {"Lista de compras", "Salir"};

    //PROGRAMA INICIAL
    public static void programas(){

        for (int i = 0; i < opcion6.length; i++) {
            System.out.printf("[%d] %s", i + 1, opcion6[i]);

            for (int j = 0; j < (17-opcion6[i].length()); j++){
                System.out.print(" ");
            }

            if ((i + 1) % 2 == 0){
                System.out.println("");
            }
        }

        Scanner opcion = new Scanner(System.in);
        System.out.print("[?]: ");
        int r = opcion.nextInt();

        MisMetodos.imprimirLinea();

        switch (r){
            case 1:
                crearLista();
                MisMetodos.imprimirLinea();
                break;
            case 2:
                System.out.println("Opcion 2: ");
                MisMetodos.imprimirLinea();
                break;
        }
    }

    //OPCION 1 CREAR LISTA DE COMPRAS
    public static void crearLista(){
        //CREAR UNA LISTA VACIA
        List<String> listaNombre = new ArrayList<>();
        List<Double> listaPrecio = new ArrayList<>();

        //PEDIR UN PRODUCTO Y SU PRECIO
        String rP;
        double rPc;


        for (int i = 1; i <= 3; i++){
            Scanner item = new Scanner(System.in);
            System.out.print("Producto: ");
            rP = item.nextLine();
            System.out.print("Precio: ");
            rPc = item.nextDouble();

            //AGREGAR A LA LISTA VACIA
            listaNombre.add(rP);
            listaPrecio.add(rPc);
        }

        //MUESTRA LA LISTA
        System.out.println(listaNombre + "-->" + listaPrecio);
    }
}
