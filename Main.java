import interfaz_grafica.Banner;
import mis_metodos.ListaOpciones;
import IMC.IMC;
import calculadora.Mate;
import calculadora.edad;
import conversor.Grados;
import conversor.longitud;
import lista.ListaDeCompras;
import conversor.conversor_de_moneda;
import mis_metodos.MisMetodos;
import libros.Biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MisMetodos.limpiarConsola();
        Banner.mensaje();
        ListaOpciones.cargarOpciones();
        MisMetodos.imprimirLinea();

        //PEDIR UNA OPCION
        Scanner intOpcion = new Scanner(System.in);
        System.out.print("[?]: ");
        int opcion = intOpcion.nextInt();


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
                longitud.cargarOperaciones();
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
            case 8:
                Biblioteca.programa();
                break;
        }
    }
}