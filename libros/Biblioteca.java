package libros;

public class Biblioteca {
    public static void programa(){
        System.out.println("Biblioteca");

        libro libro1 = new libro("El Principito", "Antoine de Saint-Exupéry", "1943");
        libro libro2 = new libro("El hombre que lo tenía todo todo todo", "Miguel Ángel Asturias", "1973");
        libro libro3 = new libro("El Señor Presidente", "Miguel Ángel Asturias", "1946");
        libro libro4 = new libro("Don Quijote de la Mancha", "Miguel de Cervantes", "1605");
        libro libro5 = new libro("Alicia en el país de las maravillas", "Lewis Carroll", "1865");
        libro libro6 = new libro("Las aventuras de Sherlock Holmes", "Arthur Conan Doyle", "1892");
        libro libro7 = new libro("El Hobbit", "J.R.R. Tolkien", "1937");
        libro libro8 = new libro("Las aventuras de Pinocho", "Carlo Collodi", "1883");
        libro libro9 = new libro("Heidi", "Johanna Spyri", "1880");
        libro libro10 = new libro("La Biblia", "Anónimo", "siglo III a.C.");

        //LIBROS
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
        System.out.println(libro4.toString());
        System.out.println(libro5.toString());
        System.out.println(libro6.toString());
        System.out.println(libro7.toString());
        System.out.println(libro8.toString());
        System.out.println(libro9.toString());
        System.out.println(libro10.toString());

        System.out.println(libro1.getTitulo());
    }
}
