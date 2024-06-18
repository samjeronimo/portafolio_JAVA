package mis_metodos;

public class ListaOpciones {

    public static void cargarOpciones(){
        String[] listaDeOpciones = {
                "Calculadora","IMC",
                "Grados","Longitud",
                "Calcular edad","Lista de compras",
                "Conversor de moneda","Biblioteca",
                "Opcion_9","Opcion_10"
        };


        for (int i = 0; i < listaDeOpciones.length;i++) {
            System.out.printf("[%d] %s", i + 1, listaDeOpciones[i]);

            for (int j = 0; j < (20-listaDeOpciones[i].length()); j++){
                System.out.print(" ");
            }

            if ((i + 1) % 2 == 0){
                System.out.println("");
            }
        }
    }
}
