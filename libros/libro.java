package libros;

public class libro {

    private String titulo;
    private String autor;
    private String fecha;

    //METODO CONSTRUCTOR
   public libro(String titulo, String autor, String fecha){
       this.titulo = titulo;
       this.autor = autor;
       this.fecha = fecha;
   }

   public String getTitulo(){return titulo;}

   public String getAutor(){return autor;}

   public String getFecha(){return fecha;}

   //METODOS DE TIPO SET (ESTABLECER)
    public void setTitulo(String titulo){this.titulo = titulo;}

    public void setAutor(String autor){this.autor = autor;}

    public void setFecha(String fecha){this.fecha = fecha;}

   @Override
   public String toString(){
       return "Titulo: " + titulo + ", Autor: " + autor + ", Fecha: " + fecha;
   }
}
