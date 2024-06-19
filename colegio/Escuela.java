package colegio;

import mis_metodos.MisMetodos;

public class Escuela {
    public static void programa(){
        MisMetodos.imprimirLinea();
        System.out.println("Segundo Primaria");

        //ESRUDIANTES
        Estudiantes alumno_1 = new Estudiantes("Carlos", "Carlos@scl.edu.gt", "A", 8, true);
        Estudiantes alumno_2 = new Estudiantes("María", "Maria@scl.edu.gt", "A", 8,true);
        Estudiantes alumno_3 = new Estudiantes("José", "Jose@scl.edu.gt", "A", 8,true);
        Estudiantes alumno_4 = new Estudiantes("Pepito", "Pepe@scl.edu.gt", "A", 8,true);
        Estudiantes alumno_5 = new Estudiantes("Karla", "karla@scl.edu.gt", "A", 8,true);

        //CURSOS
        Cursos curso1 = new Cursos("Matematicas", "Ciencia", "Tercer periodo");
        Cursos curso2 = new Cursos("Comunicación y Lenguaje", "Lengua", "Primer periodo");
        Cursos curso3 = new Cursos("Expresión Artística", "Artes", "Ultimo periodo");
        Cursos curso4 = new Cursos("Ciencias Naturalez", "Ciencia", "Quinto periodo");
        Cursos curso5 = new Cursos("Ciencas Sociales", "Ciencia", "Segundo periodo");


        System.out.println(alumno_1.getNombre());
        System.out.println(alumno_1.getCorreo());
        System.out.println(curso1.getNombre());
        System.out.println("---------------------------");

        System.out.println(alumno_2.getNombre());
        System.out.println(alumno_2.getCorreo());
        System.out.println(curso2.getNombre());
        System.out.println("---------------------------");

        System.out.println(alumno_3.getNombre());
        System.out.println(alumno_3.getCorreo());
        System.out.println(curso3.getNombre());
        System.out.println("---------------------------");

        System.out.println(alumno_4.getNombre());
        System.out.println(alumno_4.getCorreo());
        System.out.println(curso4.getNombre());
        System.out.println("---------------------------");

        System.out.println(alumno_5.getNombre());
        System.out.println(alumno_5.getCorreo());

    }
}
