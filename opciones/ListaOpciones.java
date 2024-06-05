package opciones;

public class ListaOpciones {

    public static void cargarOpciones(){
        String[] listaDeOpciones = {
                "Calculadora","IMC",
                "Grados","Opcion_4",
                "Calcular edad","Lista de compras",
                "Opcion_7","Opcion_8",
                "Opcion_9","Opcion_10"
        };


        for (int i = 0; i < listaDeOpciones.length;i++) {
            System.out.printf("[%d] %s", i + 1, listaDeOpciones[i]);

            for (int j = 0; j < (13-listaDeOpciones[i].length()); j++){
                System.out.print(" ");
            }

            if ((i + 1) % 2 == 0){
                System.out.println("");
            }
        }
    }
}
