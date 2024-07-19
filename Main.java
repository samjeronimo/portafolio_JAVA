import colegio.Escuela;
import colegio.Estudiantes;
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

import javax.swing.*;
import java.awt.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //SECCIÓN GRÁFICA
        JFrame miVentana = new JFrame("JERÓNIMO");
        miVentana.setBounds(0, 0, 500, 600);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(null);

        //SECCIÓN PANEL
        JPanel banner = new JPanel();
        banner.setBackground(Color.pink);
        banner.setBounds(0, 0, 500, 600);
        banner.setLayout(null);
        miVentana.add(banner);
        miVentana.setVisible(true);



        //SECCIÓN LABEL
        JLabel texto = new JLabel("ROCKEMMA", SwingConstants.CENTER);
        texto.setFont(new Font("Arial", Font.BOLD, 20));
        texto.setBounds(0, 10, 500, 30);
        texto.setForeground(Color.white);
        banner.add(texto);

        //OPCIONES
        JLabel num1 = new JLabel("[1]----------");
        num1.setBounds(50, 100, 150, 30);
        num1.setForeground(Color.white);

        JLabel num2 = new JLabel("[2]----------");
        num2.setBounds(300, 100, 150, 30);
        num2.setForeground(Color.white);

        JLabel num3 = new JLabel("[3]----------");
        num3.setBounds(50, 200, 150, 30);
        num3.setForeground(Color.white);

        JLabel num4 = new JLabel("[4]----------");
        num4.setBounds(300, 200, 150, 30);
        num4.setForeground(Color.white);

        JLabel num5 = new JLabel("[5]----------");
        num5.setBounds(50, 300, 150, 30);
        num5.setForeground(Color.white);

        JLabel num6 = new JLabel("[6]----------");
        num6.setBounds(300, 300, 150, 30);
        num6.setForeground(Color.white);

        miVentana.add(num1);
        miVentana.add(num2);
        miVentana.add(num3);
        miVentana.add(num4);
        miVentana.add(num5);
        miVentana.add(num6);


        //SECCION BOTON
        JButton btn = new JButton("Boton");
        btn.setBounds(350, 400, 100, 50);
        banner.add(btn);



        miVentana.add(banner);
        miVentana.setVisible(true);




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
            case 9:
                Escuela.programa();
                break;
        }
    }
}