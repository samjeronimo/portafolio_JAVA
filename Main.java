import interfaz_grafica.Banner;
import opciones.ListaOpciones;
import programas.IMC;
import matematicas.Mate;
import calcular_edad.edad;
import ProgramaGrados.Grados;
import lista.ListaDeCompras;
import conversorMoneda.conversor_de_moneda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Banner.mensaje();
        ListaOpciones.cargarOpciones();

        //PEDIR UNA OPCION
        Scanner intOpcion = new Scanner(System.in);
        System.out.print("[?]: ");
        int opcion = intOpcion.nextInt();
        System.out.println("------------------------------");


        //CARGAR OPCION DEL USUARIO
        switch (opcion) {
            case 1:
                Mate.programa();
                break;
            case 2:
                IMC.programaIMC();
                break;
            case 3:
                Grados.grados();
                break;
            case 4:
                System.out.println();
                break;
            case 5:
                edad.edad();
                break;
            case 6:
                ListaDeCompras.programas();
                break;
            case 7:
                conversor_de_moneda.conversor();
                break;
        }
    }
}