package matematicas;
import java.util.Scanner;
public class Mate {

    public static void programa(){


        String[] opciones = {"Sumar","Restar","Dividir","Multiplicar"};


        for (int i = 0; i < opciones.length; i++){
            System.out.printf("[%d] %s ",i+1,opciones[i]);

            for (int j = 0; j < (12 - opciones[i].length()); j++){
                System.out.print(" ");
            }

            if ((i+1)%2==0){  //CANTIDAD DE COLUMNAS
                System.out.println("");
            }

        }

        Scanner opcion = new Scanner(System.in);
        System.out.print("[?]: ");
        int res_opcion = opcion.nextInt();
        System.out.println("------------------------------");

        System.out.println();
        switch (res_opcion){
            case 1:
                Scanner proceso1 = new Scanner(System.in);
                System.out.print("Num1: ");
                int numero1 = proceso1.nextInt();
                System.out.print("Num2: ");
                int numero2 = proceso1.nextInt();

                System.out.println("Repuesta: " + suma(numero1, numero2));
                break;
            case 2:
                Scanner proceso2 = new Scanner(System.in);
                System.out.print("Num1: ");
                int numero3 = proceso2.nextInt();
                System.out.print("Num2: ");
                int numero4 = proceso2.nextInt();

                System.out.println("Respuesta: " + resta(numero3, numero4));
                break;
            case 3:
                Scanner proceso3 = new Scanner(System.in);
                System.out.print("Num1: ");
                int numero5 = proceso3.nextInt();
                System.out.print("Num2: ");
                int numero6 = proceso3.nextInt();

                System.out.println("Respuesta: " + dividir(numero5, numero6));
                break;
            case 4:
                Scanner proceso4 = new Scanner(System.in);
                System.out.print("Num1: ");
                int numero7 = proceso4.nextInt();
                System.out.print("Num2: ");
                int numero8 = proceso4.nextInt();

                System.out.print("Respuesta: " + multiplicar(numero7, numero8));
                break;


        }


    }


    public static int suma(int num1, int num2){
        int Sumar = num1 + num2;
        return Sumar;
    }

    public static int resta(int num1, int num2){
        int Restar = num1 - num2;
        return Restar;
    }

    public static double dividir(double num1, double num2){
        double Dividir = num1 / num2;
        return Dividir;
    }

    public static int multiplicar(int num1, int num2){
        int Multiplicar = num1 * num2;
        return Multiplicar;
    }

}