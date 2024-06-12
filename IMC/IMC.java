package IMC;

import java.util.Scanner;

public class IMC {

    public static double calcularIMC(double peso,double altura) {
        //PROCESO
        double IMC = peso / (altura * altura);
        return IMC;
    }

    public static void programaIMC(){

        Scanner entradaDeDatos = new Scanner(System.in);
        System.out.print("Peso: ");
        double peso = entradaDeDatos.nextDouble();
        System.out.print("Altura: ");
        double altura = entradaDeDatos.nextDouble();

        //PROCESO
        double respuestaIMC = calcularIMC(peso, altura);

        //RESULTADO
        System.out.println("IMC: " + respuestaIMC);

        System.out.println("--------------------");
        if (respuestaIMC < 18.5){
            System.out.println("--> IMC Bajo: ");
        } else if (respuestaIMC > 18.5 && respuestaIMC < 24.9){
            System.out.println("--> IMC Normal: ");
        } else if (respuestaIMC > 25 && respuestaIMC < 29.9) {
            System.out.println("--> Sobre peso: ");
        } else if (respuestaIMC> 30 && respuestaIMC < 34.9) {
            System.out.println("--> Obesidad I");
        } else if (respuestaIMC > 35 && respuestaIMC < 39.9) {
            System.out.println("--> Obesidad II");
        } else if (respuestaIMC > 40 && respuestaIMC < 49.9) {
            System.out.println("--> Obesidad III");
        } else if (respuestaIMC > 50) {
            System.out.println("--> Obesidad IV");
        }
    }
}

